package utilidades;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ES {
    private static Scanner sc = new Scanner(System.in);
    public static int leerEntero(){
        do{
            try {
                return sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println();
                sc.nextLine();
            }
        }while (true);
    }
    public static int leerEntero(String codigo){
        System.out.println("introduce un numero entero ");
        return leerEntero();
    }
    public class LeerString {
        public static void main(String[] args) {
            String input = "";
    
            try {
                System.out.print("Por favor, introduce un texto: ");
                input = sc.nextLine();
                System.out.println("Has introducido: " + input);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error al leer la entrada: " + e.getMessage());
            } finally {
                sc.close(); 
            }
        }
    }
}
