/* 10.Poner a 0 una matriz de 10 filas y 5 columnas y visualizar el contenido por filas.*/
public class ejercicio10 {
    public static void main(String[] args) {
        int[][] matriz = new int[10][5];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = 0;
            }
        }
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");// he tenido que meter un espacio para que separe los ceros
            }
            System.out.println();// he tenido que poner este sout para que no me lo ponga todo en una sola linea
        }
        System.out.println(" este es el contenido de la matriz ");
    }
}
