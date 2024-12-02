import java.util.Scanner;

public class media_de_cinco_numeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numero1, numero2, numero3, numero4, numero5, media;
        float media5;

        System.out.print("teclea el primer numero ");
        numero1 = teclado.nextInt();
        
        System.out.print("teclea el segundo numero ");
        numero2 = teclado.nextInt();
        
        System.out.print("teclea el tercer numero ");
        numero3 = teclado.nextInt();
        
        System.out.print("teclea el cuarto numero ");
        numero4 = teclado.nextInt();
        
        System.out.print("teclea el quinto numero ");
        numero5 = teclado.nextInt();

        media5 = (numero1 + numero2 + numero3 + numero4 + numero5)/5;
        System.out.println("la media de los 5 numeros es " + media5);

        media5 = (float)(numero1 + numero2 + numero3 + numero4 + numero5)/5;
        System.out.println("La media de 5 numeros es " + media5);

        teclado.close();
        
    }
}