/* Ejercicio 4.
Se desea crear un juego en el que el usuario compita contra el PC. El juego consiste en que hay tres pilas con una cantidad aleatoria de cerillas (suponemos que el número de cerillas de cada pila puede estar entre 1 y 10). Cada jugador (el usuario o el PC), de forma alterna, irán cogiendo la cantidad de cerillas que quieran (al menos 1) de una única pila. Gana el jugador que consigue que el oponente tome la última cerilla.
Hay que tener en cuenta que:
    • Es necesario crear un array de 3 elementos con el número de cerillas que contiene cada pila.
    • Se debe mostrar por pantalla el número de pila y la cantidad de cerillas que tiene mediante barras verticales (|) y añadiendo un espacio entre cada 1.
    • El PC debe elegir de forma aleatoria una pila y una cantidad de cerillas.
    • Se debe usar los métodos de la clase Utilidades que se encuentra en la biblioteca aguadulce.*/

import java.util.Scanner;

import aguadulce.Utilidades;

public class ejercicio18 {
    public static void main(String[] args) {
        int[] pilas = new int[3];
        Scanner sc = new Scanner(System.in);
        boolean mi_turno = true;
        for (int i = 0; i < pilas.length; i++) {
            pilas[i] = Utilidades.numAleatorio(1, 10);
        }

        if (mi_turno) {
            System.out.println("el ordenador a ganado ");
        } else {
            System.out.println("has ganado");
        }
    }
}
