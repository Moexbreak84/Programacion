import java.io.Console;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ciudades {

    public static void main(String[] args) {
        ArrayList<String> ciudades = new ArrayList<>(Arrays.asList("Almeria", "Granada", "Malaga", "Cadiz", "sevilla",
                "huelva", "Cordoba", "Jaen", "Murcia", "Valencia"));

        // muestra si la palabra esta en el arraylist
        System.out.printf("%s %s esta en la lista", "Granada", ciudades.contains("Granada") ? "si" : "no");

        // muestra la posicion de la lista en la que se encuentran si no esta en la
        // lista mostrara posicion -1
        int a = ciudades.indexOf("Cadiz");
        int b = ciudades.indexOf("Barcelona");
        System.out.println("\n" + "la ciudad se encuentra en " + a);
        System.out.println("la ciudad se encuentra en " + b);

        // muestra el arraylist ordenado con el null por defecto si no puedes
        // especificar como en donde se encuentra el null.
        ciudades.sort(null);
        System.out.println(ciudades);

        // muestra el arraylist ordenado descendente con la condicion que lleva entre
        // parentesis
        ciudades.sort(Comparator.reverseOrder());
        System.out.println(ciudades);

        // convierte el arraylist en un array de string y con el foreach imprimime el
        // array
        String[] citys = new String[ciudades.size()];
        citys = ciudades.toArray(citys);
        for (String s : citys) {
            System.out.print(s + " ");
        }

        // Creacion de otro Arraylist este de pueblos y unido al de ciudades
        ArrayList<String> pueblos = new ArrayList<>(Arrays.asList("Vicar", "Roquetas de mar", "Adra", "Aguadulce",
                "Viator", "Gador", "Macael", "Turrillas"));
        ciudades.addAll(pueblos);
        System.out.print("\n" + ciudades + " ");

        // listas combinadas aleatoriamente
        ArrayList<String> combinacion = new ArrayList<>(ciudades);
        combinacion.addAll(pueblos);
        Collections.shuffle(combinacion, new Random());
        System.out.println("Lista combinada y mezclada: " + combinacion);

    }
}
