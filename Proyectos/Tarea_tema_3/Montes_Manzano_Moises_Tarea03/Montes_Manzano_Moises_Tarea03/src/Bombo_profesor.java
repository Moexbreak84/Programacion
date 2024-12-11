import java.util.InputMismatchException;
import java.util.Scanner;

import aguadulce.Bombo;

public class Bombo_profesor {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        for (int i = 30; i <= 90; i = i + 20)
            jugar(i);
    }

    private static void jugar(int capacidadBombo) {
        Bombo miBombo = new Bombo(capacidadBombo);
        int numero1, numero2, numero3, numero4, numero5, bola, contador = 0;

        System.out.println("BINGO LA PUEBLA");
        System.out.println("El bombo contiene " + capacidadBombo + " bolas.");
        numero1 = leerEntero("Introduzca su primer número: ", 1, capacidadBombo);
        numero2 = leerEntero("Introduzca su segundo número: ", 1, capacidadBombo);
        numero3 = leerEntero("Introduzca su tercer número: ", 1, capacidadBombo);
        numero4 = leerEntero("Introduzca su cuatro número: ", 1, capacidadBombo);
        numero5 = leerEntero("Introduzca su quinto número: ", 1, capacidadBombo);

        System.out.println(String.format("Sus números son: %d, %d, %d, %d y %d",
                numero1, numero2, numero3, numero4, numero5));
        System.out.println("--------------------\nComienza el juego:");
        do {
            bola = miBombo.extraerBola();
            System.out.print(bola + " ");
            if (bola == numero1 || bola == numero2 || bola == numero3 || bola == numero4 || bola == numero5)
                contador++;
        } while (contador < 5);
        System.out.println("\nHa sido necesario sacar " + miBombo.getCantidadBolasExtraidas() +
                " para que salgan los números elegidos.");
        System.out.println("----\n\n");
    }

    private static int leerEntero(String mensaje, int minimo, int maximo) {
        int numero;
        do {
            try {
                System.out.print(mensaje);
                numero = teclado.nextInt();

                if (numero < minimo)
                    System.out.println("Error. El número debe ser 1 o superior.");
                else if (numero > maximo)
                    System.out.println("Error. El número debe ser igual o inferior a " + maximo);
                else
                    return numero;
            } catch (InputMismatchException e) {
                System.out.println("Error. Se debe introducir un número entero.");
                teclado.nextLine();
            }
        } while (true);
    }
}