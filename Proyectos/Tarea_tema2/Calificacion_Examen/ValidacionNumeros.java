import java.util.Scanner;

public class ValidacionNumeros {
    public static void main(String[] args) {
        // Declaración de variables.
        Scanner teclado = new Scanner(System.in);
        int numero, menor, mayor, digito;

        // Lectura de la información
        System.out.println("DÍGITO MAYOR Y DÍGITO MENOR\n" + //
                "---------------------------");

        do {
            System.out.print("Introduce un número de 6 dígitos: ");
            numero = teclado.nextInt();

            if (numero < 0)
                System.out.println("ERROR. El número tiene que ser positivo.");
            else if (numero < 100000 || numero > 999999)
                System.out.println("ERROR. El número no tiene seis dígitos.");
            else if(numero % 2 != 0)
                System.out.println("ERROR. El número no es par.");
            else if(numero % 10 == 4)
                System.out.println("ERROR. El número acaba en cuatro.");
        } while (numero < 100000 || numero > 999999 || numero % 2 != 0 || numero % 10 == 4);

        // Búsqueda del mayor y menor dígito
        mayor = 0;
        menor = 9;
        while (numero != 0) {
            digito = numero % 10;

            if(menor > digito)
                menor = digito;

            if(mayor < digito)
                mayor = digito;

            numero = numero /10;
        }

        // Mostrar mayor y menor
        System.out.println("El dígito mayor es el "+ mayor + " y el menor el "+ menor);

        teclado.close();
    }
}
