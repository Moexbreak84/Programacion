package Intercambio_de_valores;

import java.util.Scanner;

public class Intercambio_de_valores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, x, y;
        System.out.println("Este es el valor de x: ");
        x = 1;
        System.out.println(x);

        System.out.println("Este es el valor de y: ");
        y = 2;
        System.out.println(y);

        a = x;
        System.out.println("Este es el nuevo valor de x: ");
        x = y;
        System.out.println(x);

        System.out.println("Este es el nuevo valor de y: ");
        y = a;
        System.out.println(y);

        teclado.close();

    }

}
