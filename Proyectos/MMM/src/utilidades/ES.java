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

    public static int leerEntero(String codigo) {
        System.out.println("introduce un numero entero ");
        return leerEntero();
    }

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    public static float leerFloat() {
        System.out.print("Introduce un valor de tipo float (con decimales): ");
        float valor = sc.nextFloat();
        System.out.println("El valor ingresado es: " + valor);
        sc.close();
        return valor;
    }

}
