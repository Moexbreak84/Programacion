/* Crear una aplicación que lea 10 números, los almacene en un array y muestre la media de ellos*/

import aguadulce.Utilidades;

public class ejercicio16 {
    public static void main(String[] args) {
        int app[] = new int[10];
        int suma = 0;
        System.out.println("estos son los numeros almacenados ");
        for (int i = 0; i < app.length; i++) {
            app[i] = Utilidades.numAleatorio(0, 100);
            suma = app[i] + suma;
            System.out.print(app[i] + " ");
        }
        System.out.println();
        suma = suma / 10;
        System.out.println("esta es la media de los numeros almacenados en la app " + suma);
    }
}
