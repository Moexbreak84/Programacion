package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
    private static Scanner sc = new Scanner(System.in);

    public static int leerEntero() {
        do {
            System.out.print("Introduce un número entero: ");
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println();
                sc.nextLine();
            }
        } while (true);
    }

    public static String leerCadena() {
        System.out.print("Introduce una cadena de texto: ");
        String cadena = sc.nextLine();
        return cadena;
    }

    public static int leerEntero(String texto, int min, int max) {
        int n;
        do {
            n = leerEntero(texto, min, max);
            if (n < min || n > max) {
                System.out.println("Error...");
            }
        } while (n < min || n > max);
        return n;
    }

}