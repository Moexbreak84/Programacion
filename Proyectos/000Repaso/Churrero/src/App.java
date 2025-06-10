import java.util.ArrayList;
import java.util.Scanner;

public class App extends Object {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

    }

    static void leerEnteros(int numero){
        ArrayList<Integer> numeros = new ArrayList<>(numero);
        for(int i = 0; i < numero; i++) {
            System.out.println("Introduce el numero " + (i + 1) + ": ");
            numeros.add(sc.nextInt());
        }   
        System.out.println("Los numeros introducidos son: ");
        for(int i = 0; i < numeros.size(); i++) {
            System.out.println("El numero del array " + numeros.get(i));
        }
    }

    @Override
    public String toString() {
        return "App []";
    }   
}
