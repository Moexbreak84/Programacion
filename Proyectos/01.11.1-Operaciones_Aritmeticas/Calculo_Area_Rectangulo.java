import java.util.Scanner;

public class Calculo_Area_Rectangulo {
    public static void main (String [] args){
        Scanner teclado = new Scanner(System.in);
        int base, altura;
        System.out.print("escribir base del rectangulo ");
        base = teclado.nextInt();
        System.out.print("escribir altura del rectangulo ");
        altura = teclado.nextInt();
        System.out.println( "el area del rectangulo es " + base * altura);
        teclado.close();
    }
}
