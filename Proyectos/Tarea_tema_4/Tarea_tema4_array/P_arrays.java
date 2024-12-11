import java.util.Scanner;

public class P_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros;
        numeros = new int[8];
        numeros[1] = -4;
        System.out.println(numeros[1]);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce numeros");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < numeros.length; i++)
            System.out.println("los numeros son " + numeros);
    }
}
