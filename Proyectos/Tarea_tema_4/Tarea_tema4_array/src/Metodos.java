
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
}