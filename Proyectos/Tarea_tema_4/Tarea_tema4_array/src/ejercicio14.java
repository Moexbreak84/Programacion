/*14.Introducir 10 números y almacenarlos en una matriz de 5 por 2. Visualizar solo las columnas impares */
public class ejercicio14 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][2];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = Metodos.leerEntero("introduce los valores del array" + i + " " + j);
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j = j + 1) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("estos son los valores de la matriz ");
    }
}
