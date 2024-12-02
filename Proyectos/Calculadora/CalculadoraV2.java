import java.util.Scanner;

public class CalculadoraV2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // derclaracion de variables

        int eleccion, numero1, numero2, resultado;
        float resultadoD;

        do {
            mostrarMenu();
            eleccion = sc.nextInt();

            numero1 = leerEntero("introduce el primer numero");
            numero2 = leerEntero("introduce el segundo numero");

            switch (eleccion) {
                case 1:
                    resultado = suma(numero1, numero2);
                    System.out.println("La suma es " + resultado);
                    break;
                case 2:
                    resultado = resta(numero1, numero2);
                    System.out.println("La resta es " + resultado);
                    break;
                case 3:
                    resultado = multiplicacion(numero1, numero2);
                    System.out.println("La multiplicacion es " + resultado);
                    break;
                case 4:
                    resultadoD = division(numero1, numero2);
                    System.out.println("la division es " + resultadoD);
                    break;

                default:
                    System.out.println("no has elejido un modo correcto con un numero de la lista");
                    break;
            }

        } while (eleccion != 0);

        sc.close();
    }

    public static void mostrarMenu() {
        System.out.println("CALCULADORA\n" +
                "-----------\n" +
                "Elije una opcion\n1.-Suma\n2.-Resta\n3.-Multiplicacion\n4.-Division\n0.Salir");
    }

    public static int suma(int numero1, int numero2) {
        int resultado;
        resultado = numero1 + numero2;
        return resultado;

    }

    public static int resta(int numero1, int numero2) {
        int resultado;
        resultado = numero1 - numero2;
        return resultado;

    }

    public static int multiplicacion(int numero1, int numero2) {
        int resultado;
        resultado = numero1 * numero2;
        return resultado;

    }

    public static float division(int numero1, int numero2) {
        float resultadoD;
        resultadoD = numero1 / numero2;
        return resultadoD;

    }

    public static int leerEntero(String mensaje) {
        int n;
        System.out.println(mensaje);
        n = sc.nextInt();

        return n;
    }

}