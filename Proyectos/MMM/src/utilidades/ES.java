package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
    private static Scanner sc = new Scanner(System.in);

    /**
     * Lee un número entero desde la entrada estándar.
     * Si se produce un error de entrada (InputMismatchException),
     * se solicita al usuario que ingrese un número nuevamente.
     *
     * @return El número entero ingresado por el usuario.
     */
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

    /**
     * Lee un número entero desde la entrada estándar, mostrando un mensaje
     * específico.
     *
     * @param codigo Mensaje que se mostrará al usuario para indicar que debe
     *               ingresar un número entero.
     * @return El número entero ingresado por el usuario.
     */
    public static int leerEntero(String texto) {
        System.out.print(texto);
        return leerEntero();
    }

    /**
     * Lee una cadena de texto desde la entrada estándar.
     *
     * @param mensaje Mensaje que se mostrará al usuario para indicar que debe
     *                ingresar un texto.
     * @return La cadena de texto ingresada por el usuario.
     */
    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    /**
     * Lee un número de tipo double desde la entrada estándar.
     *
     * @param mensaje Mensaje que se mostrará al usuario para indicar que debe
     *                ingresar un número decimal.
     * @return El número double ingresado por el usuario.
     */
    public static double leerDouble(String mensaje) {
        System.out.print(mensaje);
        return Double.parseDouble(sc.nextLine());
    }

    /**
     * Lee un número de tipo float desde la entrada estándar.
     * Solicita al usuario que ingrese un valor decimal y muestra el valor
     * ingresado.
     *
     * @return El valor float ingresado por el usuario.
     */
    public static float leerFloat(String texto) {
        System.out.print(texto);
        float valor = sc.nextFloat();
        System.out.println("El valor ingresado es: " + valor);
        sc.close();
        return valor;
    }

    /**
     * Este metodo limpia el teclado y lo uso desde principal para que no de error al pasar de un tipo de dato a cualquier otro tipo de * dato.
     */
    public static void limpiarTeclado(){
        sc.nextLine();
    }

}
