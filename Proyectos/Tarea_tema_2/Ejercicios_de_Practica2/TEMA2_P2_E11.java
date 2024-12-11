import java.util.Scanner;

public class TEMA2_P2_E11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero;
        do {
            System.out.println("intoduce un numero positivo ");
            numero = sc.nextInt();
        } while (numero <= 0);
        System.out.println(numero + " este numero es valido");
        int numero2 = numero, cifras = 0;
        while (numero2 > 0) {
            numero2 /= 10;
            cifras++;
        }
        System.out.println("tiene esta cantidad de cifras " + cifras);

    }
}
