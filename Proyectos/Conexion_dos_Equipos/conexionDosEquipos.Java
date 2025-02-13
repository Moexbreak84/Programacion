package comunicacion;
import java.util.Scanner;


public class ChatApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el modo:");
        System.out.println("1. Servidor");
        System.out.println("2. Cliente");
        System.out.print("Opción: ");
        int opcion = scanner.nextInt();
        scanner.nextLine(); 

        // Datos de conexión
        String direccionServidor = "localhost";
        int puerto = 5000;
        
        // Creamos el objeto ChatConnection que se comportará como servidor o cliente
        ChatConnection chat = new ChatConnection(opcion == 1, direccionServidor, puerto);
        chat.startChat();  // Inicia la sesión de chat

        scanner.close();
    }
}
  1
  2
  3
  4
  5
  6
  7
  8
  9
 10
 11
 12
 13
 14
 15
 16
 17
 18
 19
 20
 21
 22
 23
 24
 25
 26
 27
 28
 29
 30
 31
 32
 33
 34
 35
 36
 37
 38
 39
 40
 41
 42
 43
 44
 45
 46
 47
 48
 49
 50
 51
 52
 53
 54
 55
 56
 57
 58
 59
 60
 61
 62
 63
 64
 65
 66
 67
 68
 69
 70
 71
 72
 73
 74
 75
 76
 77
 78
 79
 80
 81
 82
 83
 84
 85
 86
 87
 88
 89
 90
 91
 92
 93
 94
 95
 96
 97
 98
 99
100
101
102
103
104
105
106
107
108
109
110
111
112
113
114
115
116
117
118
119
120
121
122
123
124
125
126
127
128
129
130
131
132
133
134
135
136
137
138
139
140
141
142
143
144
package comunicacion;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatConnection {
    private Socket socket;
    private ServerSocket serverSocket;
    private final boolean isServer;
    private final String serverAddress;
    private final int port;
    private volatile boolean exit = false;

    public ChatConnection(boolean isServer, String serverAddress, int port) {
        this.isServer = isServer;
        this.serverAddress = serverAddress;
        this.port = port;
        
        try {
            if (isServer) {
                serverSocket = new ServerSocket(port);
                System.out.println("Servidor: Esperando conexión en el puerto " + port + "...");
                socket = serverSocket.accept();
                System.out.println("Servidor: Cliente conectado.");
            } else {
                socket = new Socket(serverAddress, port);
                System.out.println("Cliente: Conectado al servidor " + serverAddress + " en el puerto " + port + ".");
            }
        } catch (IOException e) {
            System.out.println("Error al establecer la conexión: " + e.getMessage());
        }
    }

    public void startChat() {
        // Se crean dos hilos: uno para enviar y otro para recibir mensajes.
        Thread sender = new Thread(new Sender());
        Thread receiver = new Thread(new Receiver());
        
        sender.start();
        receiver.start();
        
        // Se espera que ambos hilos terminen
        try {
            sender.join();
            receiver.join();
        } catch (InterruptedException e) {
            System.out.println("Error en los threads: " + e.getMessage());
        }
        
        closeConnection();
    }

    // Cierra la conexión
    private void closeConnection() {
        try {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
            if (serverSocket != null && !serverSocket.isClosed()) {
                serverSocket.close();
            }
        } catch (IOException e) {
            System.out.println("Error cerrando la conexión: " + e.getMessage());
        }
        System.out.println("Conexión cerrada.");
    }

    // Hilo encargado de enviar mensajes (lee desde System.in)
    private class Sender implements Runnable {
        @Override
        public void run() {
            try {
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                Scanner scanner = new Scanner(System.in);
                String msg;
                
                // El prompt identifica al usuario según su rol
                String prompt = isServer ? "Servidor" : "Cliente";
                
                do{
                    //System.out.print(prompt + ": ");
                    msg = scanner.nextLine();
                    out.println(msg);
                    if(msg.equalsIgnoreCase("salir"))
                        exit = true;
                }while (!exit) ;

            } catch (IOException e) {
                System.out.println("Error en el envío: " + e.getMessage());
            }
        }
    }

    // Hilo encargado de recibir mensajes
    private class Receiver implements Runnable {
        @Override
        public void run() {
            try {
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String msg;
                
                // En este hilo, la etiqueta se asigna al receptor (el rol opuesto)
                String label = "\u001b[31m" + (isServer ? "Cliente" : "Servidor");
                
                while ((msg = in.readLine()) != null && !exit) {
                    if (msg.equalsIgnoreCase("salir")) {
                        System.out.println("\n" + label + " ha cerrado la conexión.");
                        exit = true;
                    }
                    System.out.println(label + ": " + msg + "\u001b[0m");
                }
            } catch (IOException e) {
                if (!exit) { // Si no se estaba cerrando intencionalmente
                    System.out.println("Error en la recepción: " + e.getMessage());
                }
            }
        }
    }
}
/*
 * Mod para el cliente con varios reintentos
 *  // Intentos múltiples de conexión
    int maxAttempts = 5;
    int attempts = 0;
    while (attempts < maxAttempts && (socket == null || !socket.isConnected())) {
        try {
            socket = new Socket(serverAddress, port);
            System.out.println("Cliente: Conectado al servidor " + serverAddress + " en el puerto " + port + ".");
        } catch (IOException e) {
            attempts++;
            System.out.println("Cliente: Fallo en el intento " + attempts + " de conectar al servidor. Reintentando en 2 segundos...");
            try {
                Thread.sleep(2000); // Espera 2 segundos antes de reintentar
            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }
        }
    }
    if (socket == null || !socket.isConnected()) {
        System.out.println("Cliente: No se pudo conectar al servidor tras " + maxAttempts + " intentos. Saliendo.");
        System.exit(1);
    }
 */