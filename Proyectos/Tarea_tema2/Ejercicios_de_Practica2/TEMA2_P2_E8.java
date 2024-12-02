import java.util.Scanner;

public class TEMA2_P2_E8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);
        System.out.println("Números entre " + menor + " y " + mayor + ":");
        for (int i = menor + 1; i < mayor; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
