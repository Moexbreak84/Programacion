import java.util.Scanner;
public class TEMA2_P2_E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int pinCorrecto = 2024;
        int pin, contador = 3;
        
        do{ 
            System.out.println("introduce el pin");
            pin = sc.nextInt();
            if (pin != pinCorrecto) {
                System.out.println("el pin es incorrecto");
                contador--; 
            }
        }while(pin != pinCorrecto && contador > 0);
        if (pin == pinCorrecto) {
            System.out.println("el pin introducido es correcto");
        }else
            System.out.println("No te quedan intentos");
        
        
        sc.close();
    }
}
