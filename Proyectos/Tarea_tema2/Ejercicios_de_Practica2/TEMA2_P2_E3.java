import java.util.Scanner;
public class TEMA2_P2_E3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        do{
            System.out.println("introduce un numero de tres cifras");
            numero = sc.nextInt();
        }while(numero < 100 || numero > 999);
        System.out.println("muy bien hecho un numero de 3 cifras");
        sc.close();
    }
    
}
