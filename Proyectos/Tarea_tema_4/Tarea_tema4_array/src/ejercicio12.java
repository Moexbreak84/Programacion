/*12.Introducir un valor y generar una matriz de ese tamaño. Inicializar las filas pares a 1 y las impares a 2. Visualiza la matriz.*/
public class ejercicio12 {

    public static void main(String[] args) {
        int[][] matriz = new int[Metodos.leerEntero("introduce el numero de filas")][Metodos
                .leerEntero("introduce el numero de columnas")];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i % 2 == 0) {
                    matriz[i][j] = 2;
                } else {
                    matriz[i][j] = 1;
                }
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println();
        }
        System.out.println("estos son los valores ");
    }

}
