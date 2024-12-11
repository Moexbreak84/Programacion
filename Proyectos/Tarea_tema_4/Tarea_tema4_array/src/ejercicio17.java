/* Crear una aplicación que rellene un array con 10 números aleatorios entre 1 y 20 (usar la clase Utilidades de la biblioteca aguadulce). Posteriormente, debe preguntarle al usuario un número y el programa debe buscarlo en el array. Si lo encuentra indicará la posición y sino existe mostrará en una única línea todos los números almacenados en el array.*/

import aguadulce.Utilidades;

public class ejercicio17 {
    public static void main(String[] args) {
        boolean encontrado = false;
        int aleatorio[] = new int[10];
        int buscador = 0;
        for (int i = 0; i < aleatorio.length; i++) {
            aleatorio[i] = Utilidades.numAleatorio(1, 20);
            System.out.print(aleatorio[i] + " ");
        }
        buscador = Metodos.leerEntero("introduce el numero que deseas saber la posicion ");
        for (int i = 0; i < aleatorio.length; i++) {
            if (buscador == aleatorio[i]) {
                System.out.println(" La posición del número es " + i);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("estos son los numeros del array");
            for (int i = 0; i < aleatorio.length; i++) {
                System.out.print(aleatorio[i] + " ");
            }
        }
    }
}
