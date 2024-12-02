import java.util.Scanner;

public class Todas_operaciones_aritmeticas {
    public static void main (String [] args){
        // Declaracón
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int suma;
        int resta;
        int multiplicacion;
        int division;
        int resto;
        
        // Introducir datos
        System.out.print( "introduce el primer numero ");
        numero1 = teclado.nextInt();
        System.out.print( "introduce el segundo numero ");
        numero2 = teclado.nextInt();
       
        // Opero y muestro resultados
        suma = numero1+numero2;
        System.out.print("el valor de la suma es ");
        System.out.println(suma);
        
        resta = numero1-numero2;
        System.out.print("el valor de la resta es ");
        System.out.println(resta);
        
        multiplicacion = numero1*numero2;
        System.out.print("el valor de la multiplicacion es ");
        System.out.println(multiplicacion);

        division = numero1/numero2;
        System.out.print("el valor de la division es ");
        System.out.println(division);

        resto = numero1%numero2;
        System.out.print("el valor de la resto es ");
        System.out.println(resto);

        teclado.close();
    }
    
}
