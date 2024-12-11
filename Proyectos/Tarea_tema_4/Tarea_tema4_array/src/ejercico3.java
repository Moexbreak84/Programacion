
/* Programa que lea 12 números enteros sobre un vector y los visualice al revés, es decir, comienza por el final del vector y termina en el elemento de la posición 0 */
import java.util.Scanner;

public class ejercico3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce los 12 numeros del vector ");
            numeros[i] = sc.nextInt();
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("estos son los numeros del vector del ultimo al primero " + numeros[i]);
        }
        sc.close();
    }

}