/* 4. Programa que lea 20 números y muestre por pantalla:

 Cuántos 7 hay.
Cuántos son mayores que el 7.
Cuántos son menores que el 7. */
public class ejercicio4 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int igual = 0, inferior = 0, superior = 0;
        inferior = Math.min(inferior, superior);
        superior = Math.max(inferior, superior);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("introduce los 20 numeros de un solo digito debes repetir numeros ");
            numeros[i] = Metodos.leerEntero("");
            if (numeros[i] == 7) {
                igual++;
            } else if (numeros[i] < 7) {
                inferior++;
            } else {
                superior++;
            }
        }
        System.out.println("menores " + inferior + " iguales " + igual + " mayores " + superior);
        Metodos.cerrarSc();
    }

}
