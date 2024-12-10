/* Ejercicio 4.
Se desea crear un juego en el que el usuario compita contra el PC. El juego consiste en que hay tres pilas con una cantidad aleatoria de cerillas (suponemos que el número de cerillas de cada pila puede estar entre 1 y 10). Cada jugador (el usuario o el PC), de forma alterna, irán cogiendo la cantidad de cerillas que quieran (al menos 1) de una única pila. Gana el jugador que consigue que el oponente tome la última cerilla.
Hay que tener en cuenta que:
    • Es necesario crear un array de 3 elementos con el número de cerillas que contiene cada pila.
    • Se debe mostrar por pantalla el número de pila y la cantidad de cerillas que tiene mediante barras verticales (|) y añadiendo un espacio entre cada 1.
    • El PC debe elegir de forma aleatoria una pila y una cantidad de cerillas.
    • Se debe usar los métodos de la clase Utilidades que se encuentra en la biblioteca aguadulce.*/

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

import aguadulce.Utilidades;

public class ejercicio18 {
    public static int[] pilas = new int[3];

    public static boolean mi_turno = true;

    public static void main(String[] args) {
        ejercicio18.iniciarJuego();
        ejercicio18.mostrarPilas();

    }

    public static void iniciarJuego() {
        for (int i = 0; i < pilas.length; i++) {
            pilas[i] = Utilidades.numAleatorio(1, 10);
        }
    }

    public static void mostrarPilas() {
        for (int i = 0; i < pilas.length; i++) {
            System.out.print("pilas " + (i + 1) + ":");
            for (int j = 0; j < pilas[i]; j++) {
                System.out.print(" |");
            }
            System.out.println();
        }
    }

    public static int leerEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean error = true;
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

    public static void turno_yo() {
        Scanner sc = new Scanner(System.in);
        int elijePila, cantidad;
        do {
            System.out.print("se debe elegir una pila entre 1 - 3: ");
            elijePila = sc.nextInt();
        } while (elijePila = 0 || elijePila > pilas.length || pilas[elijePila]);
    }

    private static void turnoPC(int[] pilas) {
        int elijePila;
        int cantidad;

        do {
            elijePila = Utilidades.numAleatorio(1, 3); // Elegir una pila aleatoria
        } while (pilas[elijePila] == 0); // Asegurarse de que la pila no esté vacía

        cantidad = Utilidades.numAleatorio(pilas[elijePila]) + 1;
        System.out.println("El PC retira " + cantidad + " cerillas de la pila " + (elijePila + 1));
        pilas[elijePila] -= cantidad;
    }
}
