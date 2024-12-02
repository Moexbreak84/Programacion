import java.util.Scanner;
public class celsius_fahrenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int celsius, fahrenheit;

        System.out.println("introduce lo grados fahrenheit: " );
        fahrenheit = teclado.nextInt();

        System.out.println("estos son los grados celsius equivalentes a los fahrenheit: ");
        System.out.println(celsius = fahrenheit -32 * 5 / 9);
        


        teclado.close();
    }
    
}
