package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
    private static Scanner sc = new Scanner(System.in);

    public static int leerEntero() {
        do {
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println();
                sc.nextLine();
            }
        } while (true);
    }

    public static int leerEntero(String texto) {
        System.out.println("introduce un numero entero ");
        return leerEntero();
    }

    public static int leerEntero(String texto, int min, int max) {
        int n;
        do {
            n = leerEntero(texto);
            if (n < min || n > max) {
                System.out.println("Error...");
            }
        } while (n < min || n > max);
        return n;
    }
}
