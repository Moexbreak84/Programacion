import java.util.Scanner;
public class TEMA2_E2 {
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int numero;

        System.out.println("introduce un numero del 1 al 7 para que te resuelva el dia de la semana que es");

        numero = sc.nextInt();

            //en un switch despues de cada caso debo de poner un break;
            switch (numero) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("el numero introducido no es un dia de la semana");
                    break;
        }
        sc.close();
    }
    
}
