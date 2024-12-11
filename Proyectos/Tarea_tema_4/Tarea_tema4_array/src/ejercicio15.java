
/*Crear una aplicación que rellene mediante los métodos de la clase Utilidades de la biblioteca aguadulce, un array de 10 elementos, siendo el contenido aleatorio. Posteriormente, mediante el uso de bucles, debe de ordenar el array de menor a mayor y mostrar el resultado por pantalla. En una línea mostrará los elementos del array inicial y en la siguiente el array una vez ordenado.
Por ejemplo:
Array inicial:

5	7	1	4	3	3	1	0	9	6
Array que se obtiene tras ordenarlo:

0	1	1	3	3	4	5	6	7	9
Nota: solo se puede crear una array y para ordenarlo solo se pueden usar bucles. */
import aguadulce.*;

public class ejercicio15 {
    public static void main(String[] args) {
        int num_orden[] = new int[10];
        int acumulador = 0;
        System.out.println("matriz desordenada");
        for (int i = 0; i < num_orden.length; i++) {
            num_orden[i] = Utilidades.numAleatorio(0, 999);
            System.out.print(num_orden[i] + " ");
        }

        System.out.println("\nmatriz ordenada ");
        for (int i = 0; i < num_orden.length; i++) {
            for (int j = i + 1; j < num_orden.length; j++) {
                if (num_orden[i] > num_orden[j]) {
                    acumulador = num_orden[i];
                    num_orden[i] = num_orden[j];
                    num_orden[j] = acumulador;
                }
            }
            System.out.print(num_orden[i] + " ");

        }
    }
}
