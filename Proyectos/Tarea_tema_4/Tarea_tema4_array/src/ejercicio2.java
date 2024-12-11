
/*Leer 8 números de teclado, almacenarlos en un vector y visualizarlos. */
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        numeros[0] = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce los 8 numeros que hay que almacenar");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("los numeros del vector son " + numeros[i]);
        }
        sc.close();
    }
}