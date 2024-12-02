import java.util.Scanner;

public class TEMA2_P2_E2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do {
            System.out.println("introduce un numero par");
            numero = sc.nextInt();
        } while (numero % 2 == 1 || numero < 0);

        System.out.println("el numero introducido es par");
        sc.close();
    }
}