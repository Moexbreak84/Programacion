import java.util.Scanner;
public class TEMA2_E5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String estacion;
       
        System.out.println("introduce la estacion del año de la cual quieres ver sus meses recuerda ñ no es valida ");
        estacion = sc.nextLine();
       
        switch (estacion) {
            case "invierno":
                System.out.println("desde el 22 de diciembre hasta el 21 de marzo incluyendo enero y febrero");
                break;
            case "primavera":
                System.out.println("desde el 22 de marzo hasta el 21 de junio incluyendo abril y mayo");
                break;
            case "verano":
                System.out.println("desde el 22 de junio hasta el 21 de septiembre incluyendo julio y agosto");
                break; 
            case "otono":
                System.out.println("desde el 22 de septiembre hasta el 21 de diciembre incluyendo octubre y noviembre");
                break;
            default:
                System.out.println("no has introducido bien el nombre de la estacion del año");
                break;
            
        }
        sc.close();
    }
}
