import java.util.Scanner;
public class TEMA2_E4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int estacion, mes;

        System.out.println("elije la estacion del año recuerda empezamos por el invierno");
        estacion = sc.nextInt();
        System.out.println("elije el mes de las estacion entre el 1 y el 3");
        mes = sc.nextInt();

         //en un switch despues de cada caso debo de poner un break;
         switch (estacion) {
            case 1:
                System.out.println("invierno");
                
                switch (mes) {
                    case 1:
                        System.out.println("diciembre");
                        break;
                    case 2:
                        System.out.println("enero");
                        break;
                    case 3:
                        System.out.println("febrero");
                        break;
                    
                    default:
                        System.out.println( "el numero introducido no es correcto con los meses que contiene la estacion del año");
                        break;
                }
                break;
            
            case 2:
                System.out.println("primavera");
                switch (mes) {
                    case 1:
                        System.out.println("marzo");
                        break;
                    case 2:
                        System.out.println("abril");
                        break;
                    case 3:
                        System.out.println("mayo");
                
                    default:
                        System.out.println( "el numero introducido no es correcto con los meses que contiene la estacion del año");
                        break;
                }
                break;
            case 3:
                System.out.println("verano");
                switch (mes) {
                    case 1:
                        System.out.println("junio");
                        break;
                    case 2:
                        System.out.println("julio");
                        break;
                    case 3:
                        System.out.println("agosto");
                    default:
                        System.out.println( "el numero introducido no es correcto con los meses que contiene la estacion del año");
                        break;
                }
                break;
            case 4:
                System.out.println("otoño");
                switch (mes) {
                    case 1:
                        System.out.println("septiembre");
                        break;
                    case 2:
                        System.out.println("octubre");
                        break;
                    case 3:
                        System.out.println("noviembre");
                
                    default:
                        System.out.println( "el numero introducido no es correcto con los meses que contiene la estacion del año");
                        break;
                }
                break;
            
            default:
                System.out.println("el numero introducido no corresponde con ninguna estacion del año ");
                break;
    }
    sc.close();
    }
}
