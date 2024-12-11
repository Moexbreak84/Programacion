import aguadulce.Dado;
import java.util.Scanner;

public class R1_Dado {
    private static Scanner sc = new Scanner(System.in);

    public static void prueba_dado() {
        Dado miDado = new Dado();
        String resultado;
        for (int i = 0; i < 20; i++) {
            resultado = miDado.lanzar();
            System.out.println(resultado);
        }
    }

    public static void ejercicio1() {
        Dado miDado = new Dado();
        String resultado;
        int acumulador = 0;
        do {
            resultado = miDado.lanzar();
            System.out.println(resultado);
            // if(resultado == SEIS){}
            if (resultado.contentEquals("SEIS")) {
                acumulador = acumulador + 1;
                // acumulador++;
                // acumulador +=1;
            } else {
                acumulador = 0;

            }
        } while (acumulador < 2);
        System.out.println("numero de lanzamientos " + miDado.getNumeroLanzamientos());
    }

    public static void ejercicio2() {
        Dado miDado = new Dado();
        String resultado;
        int acumulador = 0;
        do {
            resultado = miDado.lanzar();
            System.out.println(resultado);
            // if(resultado == SEIS){}
            if (resultado.contentEquals("SEIS")) {
                acumulador = acumulador + 1;
                // acumulador++;
                // acumulador +=1;
            } else {
                acumulador = 0;

            }
        } while (acumulador < 2);

        System.out.println("numero de lanzamientos " + miDado.getNumeroLanzamientos());
        for (int i = 1; i <= miDado.getNumeroCaras(); i++) {
            System.out.println("numero de veces de la cara " + i + ": " + miDado.getNumeroVecesCara(i));
        }
    }

    public static void ejercicio3() {
        Dado miDado = new Dado();
        String resultado = "Nada", num_anterior = "";
        int acumulador = 0;
        do {
            resultado = miDado.lanzar();
            System.out.println(resultado);

            if (resultado == num_anterior) {
                acumulador++;
            } else {
                acumulador = 1;
            }
            num_anterior = resultado;
        } while (acumulador < 2);

        System.out.println("numero de lanzamientos " + miDado.getNumeroLanzamientos());
        /*
         * for (int i = 1; i <= miDado.getNumeroCaras(); i++) {
         * System.out.println("numero de veces de la cara " + i + ": " +
         * miDado.getNumeroVecesCara(i));
         * }
         */
    }

    public static void ejercicio4() {
        Dado miDado = new Dado();
        String resultado = "";
        boolean UNO = false, DOS = false, TRES = false, CUATRO = false, CINCO = false, SEIS = false;
        do {
            resultado = miDado.lanzar();
            switch (resultado) {
                case "UNO":
                    UNO = true;
                    break;
                case "DOS":
                    DOS = true;
                    break;
                case "TRES":
                    TRES = true;
                    break;
                case "CUATRO":
                    CUATRO = true;
                    break;
                case "CINCO":
                    CINCO = true;
                    break;
                case "SEIS":
                    SEIS = true;
                    break;

                default:
                    break;
            }
        } while (!UNO || !DOS || !TRES || !CUATRO || !CINCO || !SEIS);
        System.out.println("Ya han salido todas las caras del dado ");
    }

    public static void ejercicio5() {
        do{
            try{
            System.out.println("introduce el numero de caras para el dado ");
            Dado miDado = new Dado(sc.nextInt());
            }catch(){}
        String resultado = "";
        }while();
        for (int i = miDado.getNumeroCaras(); i >= 1; i--) {

            resultado = resultado + miDado.lanzar() + " ";

        }
        System.out.println(resultado);
        sc.close();
    }
}
