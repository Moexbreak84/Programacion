
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import aguadulce.Utilidades;

public class Metodos {
    private static Scanner sc = new Scanner(System.in);

    public static int leerEntero(String mensaje) {

        int numero = 0;
        boolean error;
        do {
            try {
                System.out.println(mensaje);
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

    public static char leerChar(String mensaje) {
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

    public static void cerrarSc() {
        sc.close();
    }

    public static int multiplicacion(int numeros, int multi) {
        int resultado;
        resultado = numeros * multi;
        return resultado;

    }

    public static void trycatch() {
        try {
            System.out.println("Resultado: ");
        } catch (ArithmeticException e) {
            System.out.println("Error");
        } finally {
            System.out.println("Bloque finally ejecutado.");

        }
    }

    public static int numAleatorio(int minimo, int maximo) {
        Random random = new Random();
        return random.nextInt((1 - 10) + 1) + minimo;

    }

    private static void mostrarPilas(int[] pilas) {
        for (int i = 0; i < pilas.length; i++) {
            System.out.print("Pila " + (i + 1) + ": ");
            for (int j = 0; j < pilas[i]; j++) {
                System.out.print("| ");
            }
            System.out.println();
        }

    }

    private static void turnoUsuario(int[] pilas, Scanner scanner) {
        while (true) {
            System.out.print("Elige una pila (1-3): ");
            int pila = scanner.nextInt() - 1;
            if (pila < 0 || pila >= pilas.length || pilas[pila] == 0) {
                System.out.println("Pila inválida. Intenta de nuevo.");
                continue;
            }
            System.out.print(
                    "Elige la cantidad de cerillas a tomar de la pila " + (pila + 1) + " (1-" + pilas[pila] + "): ");
            int cerillas = scanner.nextInt();
            if (cerillas < 1 || cerillas > pilas[pila]) {
                System.out.println("Cantidad inválida. Intenta de nuevo.");
            } else {
                pilas[pila] -= cerillas;
                break;
            }
        }
    }

    private static void turnoPC(int[] pilas) {
        Random random = new Random();
        while (true) {
            int pila = Utilidades.obtenerNumeroAleatorio(0, 2);
            if (pilas[pila] > 0) {
                int cerillas = Utilidades.obtenerNumeroAleatorio(1, pilas[pila]);
                pilas[pila] -= cerillas;
                System.out.println("El PC toma " + cerillas + " cerillas de la pila " + (pila + 1) + ".");
                break;
            }
        }
    }

    private static int sumarCerillas(int[] pilas) {
        int suma = 0;
        for (int cerillas : pilas) {
            suma += cerillas;
        }
        return suma;
    }
}
