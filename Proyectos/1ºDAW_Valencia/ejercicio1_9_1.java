import java.util.Scanner;

public class ejercicio1_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, contador;
        System.out.println("escribe el valor de a");
        a = sc.nextInt();
        System.out.println("introduce el valor de b");
        b = sc.nextInt();
        c = 0;
        contador = 0;

        while (contador < b) {
            c = c + a;
            contador++;
        }
        System.out.println(a + "*" + b + "=" + c);
        sc.close();
    }
    
}
