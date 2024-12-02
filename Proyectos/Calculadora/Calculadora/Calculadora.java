package Calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        // declaracion de variables
        Scanner sc = new Scanner(System.in);
        int eleccion, numero1, numero2, resultado;
        float resultadoD;
        do {
            mostrarMenu();
            eleccion = sc.nextInt();

            switch (eleccion) {
                case 1:
                    System.out.println("Vamos a sumar");
                    System.out.println("introduce el primer numero ");
                    numero1 = sc.nextInt();
                    System.out.println("introduce el segundo numero ");
                    numero2 = sc.nextInt();
                    resultado = suma(numero1, numero2);
                    System.out.println("La suma es " + resultado);
                    break;
                case 2:
                    System.out.println("Vamos a restar");
                    System.out.println("introduce el primer numero ");
                    numero1 = sc.nextInt();
                    System.out.println("introduce el segundo numero ");
                    numero2 = sc.nextInt();
                    resultado = resta(numero1, numero2);
                    System.out.println("La resta es " + resultado);
                    break;
                case 3:
                    System.out.println("Vamos a multiplicar");
                    System.out.println("introduce el primer numero ");
                    numero1 = sc.nextInt();
                    System.out.println("introduce el segundo numero ");
                    numero2 = sc.nextInt();
                    resultado = multiplicacion(numero1, numero2);
                    System.out.println("La multiplicacion es " + resultado);
                    break;
                case 4:
                    System.out.println("Vamos a dividir");
                    System.out.println("introduce el primer numero ");
                    numero1 = sc.nextInt();
                    System.out.println("introduce el segundo numero ");
                    numero2 = sc.nextInt();
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

}
