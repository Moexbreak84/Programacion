import java.util.Scanner;

public class ejercicio1_10_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador;
        int n = sc.nextInt("introduce el numero natural");
        do{
            contador = n - 1;
            n = n + (n-1);

        }while(contador > 0){

        }
    }
    
}
