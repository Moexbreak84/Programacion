package Montes_Manzano_Moisés_tarea04;

public class ClasePrincipal {
    public static int[][] serieF = new int[4][3];
    public static int acumulador1 = 1;
    public static int acumulador2 = 0;
    public static int siguiente = 1;
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        ClasePrincipal.fibonacci();

    }

    public static void fibonacci() {
        for (int i = 0; i < serieF.length; i++) {
            for (int j = 0; j < serieF[i].length; j++) {
                if (i == 0 && j == 0) {
                    serieF[i][j] = 0;
                    acumulador2 = serieF[i][j];
                } else if (i == 0 && j == 1) {
                    serieF[i][j] = 1;
                    acumulador1 = serieF[i][j];
                } else {
                    serieF[i][j] = acumulador1 + acumulador2;
                    acumulador2 = acumulador1;
                    acumulador1 = serieF[i][j];
                }
                
            }
            System.out.println();
        }
        for (int i = 0; i < serieF.length; i++) {
            for (int j = 0; j < serieF[i].length; j++) {
                if (i+j / 2 == 0){
                   

                } 
                System.out.print(serieF[i][j] + " ");
                System.out.print("");
            }
            System.out.println();
        }
    

}
