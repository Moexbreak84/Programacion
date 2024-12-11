/* 6. Programa que introduzca la edad de 20 personas en un vector. ¿Cuántos hay mayores de edad?*/
public class ejercicio7 {
    public static void main(String[] args) {
        char[] letras = new char[14];
        int acumulador = 0;
        for (int i = 0; i < letras.length; i++) {
            letras[i] = Metodos.leerChar("introduce las letras");
            if (letras[i] == 'A' || letras[i] == 'a') {
                acumulador++;
            }
        }

        System.out.println("Has tenido un total de " + acumulador + " A's");
    }
}
