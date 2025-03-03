import java.util.ArrayList;
import java.util.Arrays;

public class NumEnteros {
    public static void main(String[] args) {
        ArrayList<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> enterosPares = new ArrayList<>();

        for (Integer entero : enteros) {
            if (entero % 2 == 0) {
                enterosPares.add(entero);
            }
        }
        System.out.print("Enteros pares: " + enterosPares);
    }
}
