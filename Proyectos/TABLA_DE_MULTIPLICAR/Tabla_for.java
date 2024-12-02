package TABLA_DE_MULTIPLICAR;
import java.util.Scanner;
public class Tabla_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //introducion y valor de variables
            int tabla;

        System.out.println("introduce el numero del cual quieres su tabla de multiplicar ");
            tabla = sc.nextInt();

           for(int i = 0; i<=10; i++){
                System.out.println(tabla + "x" + i + "=" + tabla*i);
           }
        sc.close(); 
          
    }
}

