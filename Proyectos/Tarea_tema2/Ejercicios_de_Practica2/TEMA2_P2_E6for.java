import java.util.Scanner;

public class TEMA2_P2_E6for {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            final int pinCorrecto = 2024;
            int pin, contador = 3;

            System.out.println("introduce el pin");
            pin = sc.nextInt();

            for (; pin != pinCorrecto && contador > 0; contador--) {
                System.out.println("el pin es incorrecto");
                pin = sc.nextInt();
            }
            if (pin == pinCorrecto) {
                System.out.println("el pin es correcto");
            } else
                System.out.println("te has quedado sin intentos");
            sc.close();
        }
    }
}
