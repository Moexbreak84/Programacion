import java.util.Scanner;

public class TEMA2_P2_E7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num_Menor, num_Mayor, contador;

            do {
                System.out.println("Introduce el primer número: ");
                num_Mayor = sc.nextInt();
                System.out.println("Introduce el segundo número menor o igual que el primero");
                num_Menor = sc.nextInt();

                if (num_Mayor < num_Menor) {
                    System.out.println("El segundo número debe ser menor o igual que el primero. Inténtalo de nuevo.");
                }
            } while (num_Mayor < num_Menor);
            System.out.println("Lista de números desde " + num_Mayor + " hasta " + num_Menor + ":");
            for (contador = num_Mayor; contador >= num_Menor; contador--) {
                System.out.println(contador);
            }
            sc.close();
        }
    }
}
