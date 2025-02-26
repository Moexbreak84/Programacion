import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
public class Ciudades {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>(Arrays.asList("Almeria","Granada","Malaga","Cadiz","sevilla","huelva","Cordoba","Jaen","Murcia","Valencia"));

        //muestra si la palabra esta en el arraylist
        System.out.printf("%s %s esta en la lista","Granada",ciudades.contains("Granada")?"si":"no");

        ciudades.indexOf("Almeria");
        ciudades.indexOf("Barcelona");
        
        //muestra el arraylist ordenado con el null por defecto si no puedes especificar como en donde se encuentra el null.
        ciudades.sort(null);
        System.out.println(ciudades);


    }
}
