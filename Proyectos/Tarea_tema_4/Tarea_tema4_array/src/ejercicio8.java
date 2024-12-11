/*8. Programa que lea 14 letras sobre un vector y muestre cuántas vocales hay */
public class ejercicio8 {
    public static void main(String[] args) {
        char[] letras = new char[14];
        int acumulador = 0;
        for (int i = 0; i < letras.length; i++) {
            letras[i] = Metodos.leerChar("introduce las letras");
            if (letras[i] == 'A' || letras[i] == 'a' || letras[i] == 'E' || letras[i] == 'e' || letras[i] == 'I'
                    || letras[i] == 'i' || letras[i] == 'O' || letras[i] == 'o' || letras[i] == 'U'
                    || letras[i] == 'u') {
                acumulador++;
            }
        }

        System.out.println("Has tenido un total de " + acumulador + " vocales");
    }
}
