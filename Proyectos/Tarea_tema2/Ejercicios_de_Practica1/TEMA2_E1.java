import java.util.Scanner;

public class TEMA2_E1 {
    public static void main(String[] args) {
        // declaracion de variables
        int numero;

        try (// declaracion Scanner
                Scanner sc = new Scanner(System.in)) {
            System.out.println("introduce el numero entre 0 y 9 ");
            numero = sc.nextInt();
            sc.close();
        }

        // mostrar resultado
        if (numero == 1) {
            System.out.println("uno");
        } else if (numero == 2) {
            System.out.println("dos");
        } else if (numero == 3) {
            System.out.println("tres");
        } else if (numero == 4) {
            System.out.println("cuatro");
        } else if (numero == 5) {
            System.out.println("cinco");
        } else if (numero == 6) {
            System.out.println("seis");
        } else if (numero == 7) {
            System.out.println("siete");
        } else if (numero == 8) {
            System.out.println("ocho");
        } else if (numero == 9) {
            System.out.println("nueve");
        } else if (numero == 0) {
            System.out.println("cero");
        } else {
            System.out.println("error");
        }

    }

}
