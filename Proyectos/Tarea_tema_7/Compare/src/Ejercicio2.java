import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ejercicio2 {
    public static void main(String[] args) {
        String[] nombres = {"Antonio", "Maria", "Pepe", "Ana", "Noelia", "Pepe"};
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();
        HashSet<String> hashset = new HashSet<>();
        LinkedHashSet<String> linkedhashset = new LinkedHashSet<>();
        TreeSet<String> treeset = new TreeSet<>();

        for (String nombre : nombres) {
            if(arrayList.add(nombre)){
            System.out.println("El nombre: "+nombre+ " se ha añadido corectamente al ArrayList");
            }else{
                System.out.println("No se ha añadido el nombre");
            }
        }
        System.out.println(arrayList);

        for (String nombre : nombres) {
            System.out.printf("El nombre %s %s se ha añadido correctamente al LinkedList\n", nombre, linkedList.add(nombre)? "":"no");   
        }
        System.out.println(linkedList);

        for (String nombre : nombres) {
            if(hashset.add(nombre)){
                System.out.println("El nombre: "+nombre+" se ha añadido correctamente al HashSet");
            }else{
                System.out.println("El nombre no se ha añadido");
            }
        }
        System.out.println(hashset);

        for (String nombre : nombres) {
            System.out.printf("el nombre %s %s se ha añadido correctamente al LinkedHashSet\n", nombre, linkedhashset.add(nombre)?"":"No");
        }
        System.out.println(linkedhashset);

        for (String nombre : nombres) {
            if(treeset.add(nombre)){
                System.out.println("El nombre: "+nombre+" se ha añadido correctamente al TreeSet");
            }else{
                System.out.println("El nombre no se ha añadido");
            }
        }
        System.out.println(treeset);
    }
    
}


