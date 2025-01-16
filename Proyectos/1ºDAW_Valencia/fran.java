import java.util.Scanner;

public class fran {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("introduce el numero ");
    int numero = sc.nextInt();
    System.out.println("introduce las veces ");
    int veces = sc.nextInt();
    int contador = 0;
    while(contador < veces){
        numero = numero + 10;
        contador++;
    }
    System.out.println("el numero sumando 1 todas las veces puestas es "+numero);
    sc.close();
    }
}
