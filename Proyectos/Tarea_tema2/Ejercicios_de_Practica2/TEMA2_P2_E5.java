import java.util.Scanner;

public class TEMA2_P2_E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nombre;

        do {

            System.out.println("introduce un nombre de entre 5 y 10 caracteres");

            nombre = sc.nextLine();
        } while (nombre.length() < 5 || nombre.length() > 10);
        sc.close();
    }
}
