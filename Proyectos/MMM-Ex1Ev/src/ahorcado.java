import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import aguadulce.*;

public class ahorcado {
    private static int NUM_MAX_ERRORES = 10;
    private static String palabras[][] = new String = {{"Ajardinaba"},{"Bobinadora"},{"Cuadratura"},{"Daltonismo"},{"Equilibrar"},{"Fiabilidad"},{"Gigantillo"},{"Habichuela"},{"Iconología"},{"jubilacion"}};
    private static char respuesta[] = new char[10];
    private static String palabraBuscada;
    private static int fallos;
    private static int letrasEncontradas;
    private static Scanner sc = new Scanner(System.in);
    private static final String ANSI_RED = "\u001B[31m";
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        ahorcado.mostrarMenu();

    }

    private static void mostrarMenu() {
        System.out.println("JUEGO DEL AHORCADO\n" +
                "-----------\n" +
                "Pulse\n1.-Nuevo Juego\n2.-Record de puntos\n0.Salir\nOpcion: ");
    }

    private static void iniciarJuego() {
        fallos = 0;
        letrasEncontradas = 0;
        boolean definicion = true;
        for(int i = 0; i < palabras.length ; i++){
            for(int = j; j < palabras[i].length; j++){
                switch (definicion) {
                    case "Ajardinaba":
                        System.out.println("convertir en jardín un terreno.");
                    break;
                    case "Bobinadora":
                        System.out.println("máquina destinada a hilar y a bobinar.");
                    break;
                    case "Cuadratura":
                        System.out.println("situación relativa de dos cuerpos celestes, que en longitud o en ascensión recta distan entre sí respectivamente uno o tres cuartos de círculo.");
                    break;
                    case "Daltonismo":
                        System.out.println("defecto de la vista que consiste en no percibir determinados colores o en confundir algunos de los que se perciben");
                    break;
                    case "Equilibrar":
                        System.out.println("compensar las masas de un mecanismo con el fin de evitar vibraciones perjudiciales en su funcionamiento.");
                    break;
                    case "Fiabilidad":
                        System.out.println(" probabilidad de buen funcionamiento de algo.");
                    break;
                    case "Gigantillo":
                        System.out.println(" figura de enano de gran cabeza");
                    break;
                    case "Habichuela":
                        System.out.println("diminutivo de haba. Judía.");
                    break;
                    case "Iconología":
                        System.out.println("estudio de las imágenes y de su valor simbólico.");
                    break;
                    case "Jubilación":
                        System.out.println("pensión que recibe quien se ha jubilado.");
                    break;
                    default:
                        break;
                }
            }
        }

    }

    private static void jugar() {

    }

    private static int verificarLetra() {
        for (int i = 0; i < palabras.length; i++) {
            for (int j = 0; j < palabras[i].length; j++) {

            }
        }

    }

    private static void mostrarEstado() {
        for( char c : respuesta)
            System.out.print(c);
        System.out.print();

    }

    private static int leerEntero(int min, int max) {
        int numero = 0;
        int menor = Math.min(0, 9);
        int mayor = Math.max(0, 9);
        boolean error;
        do {
            try {
                System.out.println("introduce un numero entre el 0 y el 9 ");
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("error");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
    }

    private static char leerCaracter(String mensaje) {
        char letra = 'a';
        boolean error = false;
        do {
            try {
                System.out.println(mensaje);
                letra = sc.nextLine().charAt(0);
                error = true;
            } catch (IllegalArgumentException e) {
                System.out.println("error" + e.getMessage());
                sc.nextLine();
            }
        } while (!error);
        return letra;
    }

    public static String getAnsiRed() {
        return ANSI_RED;
    }

    public static String getAnsiGreen() {
        return ANSI_GREEN;
    }

    public static String getAnsiReset() {
        return ANSI_RESET;
    }

}
