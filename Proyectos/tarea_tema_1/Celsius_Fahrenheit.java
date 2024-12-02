import java.util.Scanner;
public class Celsius_Fahrenheit {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int celsius, fahrenheit;

        System.out.println("introduce lo grados centigrados: " );
        celsius = teclado.nextInt();

        System.out.println("estos son los grados fahrenheit equivalentes a los centigrados: ");
        System.out.println(fahrenheit = celsius * 9 / 5 + 32);
        


        teclado.close();
    }
    
}
