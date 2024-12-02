package TABLA_DE_MULTIPLICAR;
import java.util.Scanner;
public class Tabla_De_Multiplicar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //introducion y valor de variables
        int  numero = 1, tablamultiplicar, tabla;

        tablamultiplicar = 10;

        System.out.println("introduce el numero del cual quieres su tabla de multiplicar ");
        tabla = sc.nextInt();

        while(numero <=10 ){
            tablamultiplicar = numero * tabla;
            System.out.println(tabla + "x" + numero + "=" + tablamultiplicar);
            numero++;
        }
    }
}
