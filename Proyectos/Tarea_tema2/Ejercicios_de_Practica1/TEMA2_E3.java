import java.util.Scanner;
public class TEMA2_E3 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int numero;

        System.out.println("introduce un numero del 1 al 12 para que te resuelva el mes correspondiente");

        numero = sc.nextInt();

            //en un switch despues de cada caso debo de poner un break;
            switch (numero) {
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");

                default:
                    System.out.println("el numero introducido no corresponde a ningun mes del año");
                    break;
        }
        sc.close();
    }
    
}
