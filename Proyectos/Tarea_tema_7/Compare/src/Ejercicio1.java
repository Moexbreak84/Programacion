import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class Ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 4, 5, 0};
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedlist = new LinkedList<>();
        HashSet<Integer> hashset = new HashSet<>();
        LinkedHashSet<Integer> linkedhashset = new LinkedHashSet<>();
        TreeSet<Integer> treeset = new TreeSet<>();

        for (int numero : numeros) {
            if(arrayList.add(numero)){
            System.out.println("El numero: "+numero+ " se ha añadido corectamente al ArrayList");
            }else{
                System.out.println("No se ha añadido el numero");
            }
        }
        System.out.println(arrayList);

        for (int numero : numeros) {
            System.out.printf("El numero %d %s se ha añadido correctamente al LinkedList\n", numero, linkedlist.add(numero)? "":"no");   
        }
        System.out.println(linkedlist);

        for (int numero : numeros) {
            if(hashset.add(numero)){
                System.out.println("El numero: "+numero+" se ha añadido correctamente al HashSet");
            }else{
                System.out.println("El numero no se ha añadido");
            }
        }
        System.out.println(hashset);

        for (int numero : numeros) {
            System.out.printf("el numero %d %s se ha añadido correctamente al LinkedHashSet\n", numero, linkedhashset.add(numero)?"":"No");
        }
        System.out.println(linkedhashset);

        for (int numero : numeros) {
            if(treeset.add(numero)){
                System.out.println("El numero: "+numero+"se ha añadido correctamente al TreeSet");
            }else{
                System.out.println("El numero no se ha añadido");
            }
        }
        System.out.println(treeset);
    }
    
}
