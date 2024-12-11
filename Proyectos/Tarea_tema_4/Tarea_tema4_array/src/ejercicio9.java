
/*9. Programa que genere al azar 30 lanzamientos de un dado y visualice cuántas veces ha salido cada cara. Para ello, utiliza un vector de tamaño 6 (un elemento por cada cara) en el que cada elemento sea un contador de cada una de las caras. */
import aguadulce.*;

public class ejercicio9 {
    public static void main(String[] args) {
        Dado mi_Dado = new Dado();
        int[] caras = new int[6];
        String resultado;
        for (int i = 0; i < 30; i++) {
            resultado = mi_Dado.lanzar();
            System.out.println(resultado);
            switch (resultado) {
                case "UNO":
                    caras[0]++;
                    break;
                case "DOS":
                    caras[1]++;
                    break;
                case "TRES":
                    caras[2]++;
                    break;
                case "CUATRO":
                    caras[3]++;
                    break;
                case "CINCO":
                    caras[4]++;
                    break;
                case "SEIS":
                    caras[5]++;
                    break;
            }

        }
        System.out.println("Ha salido " + caras[0] + " veces uno " + caras[1] + " veces dos " + caras[2]
                + " veces tres " + caras[3]
                + " veces cuatro " + caras[4] + " veces cinco " + caras[5] + " veces seis");
    }
}
