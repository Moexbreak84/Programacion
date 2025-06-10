public class Practica {

    public static void main(String[] args) {    
        int[] numeros = new int[10];
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[8] = 4;
        numeros[4] = 5;
        numeros[9] = 6;
        numeros[6] = 7;
        numeros[7] = 8;

        for(int i = 0; i < numeros.length; i++) {
            System.out.println("el numero del array " +numeros[i]);

        }
    }

}
