import java.util.Scanner;

public class TEMA2_E6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String scrabble;
        int acumulador, multiplicador, resultado;
        char texto;
        acumulador = 0;
        System.out.println("introduce el multiplicador que puede se 1, 2 o 3");
        multiplicador = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("introduce una palabra de 5 letras");
            scrabble = sc.nextLine();
        } while (scrabble.length() < 5);

        for (int i = 0; i < scrabble.length(); i++) {
            texto = scrabble.charAt(i);
            switch (texto) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    acumulador += 1;
                    break;
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    acumulador += 1;
                    break;
                case 'x':
                case 'y':
                case 'z':
                    acumulador += 2;
                    break;
                case 'X':
                    acumulador += 5;
                default:
                    acumulador -= 1;
                    break;
            }
        }

        resultado = multiplicador * acumulador;
        System.out.println("este es tu resultado " + resultado);
        sc.close();
    }

}
