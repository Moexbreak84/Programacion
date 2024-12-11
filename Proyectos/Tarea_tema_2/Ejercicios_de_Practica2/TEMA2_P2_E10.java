import java.util.Scanner;

public class TEMA2_P2_E10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // declaracion de variables
        int num1, num2;
        System.out.println("introduce el primer numero");
        num1 = sc.nextInt();
        System.out.println("introduce el segundo numero");
        num2 = sc.nextInt();
        int menor = Math.min(num1, num2);
        int mayor = Math.max(num1, num2);
        int acumulador = 0;
        /**
         * if(menor > mayor){
         * int aux = menor;
         * menor = mayor;
         * mayor = aux;
         * }
         **/
        for (int i = menor; i <= mayor; i++) {
            acumulador = acumulador + i;
        }
        System.out.println("la suma de todos los numeros intermedios es: " + acumulador);
        sc.close();
    }
}
