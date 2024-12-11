/*Crear e inicializar un vector de 10 elementos a 0 */
public class ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        numeros[0] = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = 0;
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }

}
