/*6. Programa que introduzca la edad de 20 personas en un vector. ¿Cuántos hay mayores de edad? */
public class ejercicio6 {
    public static void main(String[] args) {
        int[] edades = new int[20];
        for (int i = 0; i < edades.length; i++) {
            edades[i] = Metodos.leerEntero("introduce las edades");
        }
        for (int i = 0; i < edades.length; i++) {
            if (edades[i] >= 18) {
                System.out.println("Estos son los que son mayores de edad " + edades[i]);
            } else {

            }

        }
    }

}
