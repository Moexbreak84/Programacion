package utilidades;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
   
    private static int leerEntero(int min, int max) {
        Scanner sc=new Scanner(System.in);
        int numero = 0;
        int menor = Math.min(0, 9);
        int mayor = Math.max(0, 9);
        boolean error;
        do {
            try {
                System.out.println("introduce un numero entre el 0 y el 9 ");
                numero = sc.nextInt();
                error = false;
            } catch (InputMismatchException e) {
                System.out.println("error");
                sc.nextLine();
                error = true;
            }
        } while (error);
        return numero;
        
    }
}
