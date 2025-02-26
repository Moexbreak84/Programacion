import java.util.LinkedList;
import java.util.ArrayList;

public class NumAleatorios {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> Aleatorios1= new ArrayList<>();
        ArrayList<Integer> Aleatorios2= new ArrayList<>();
        Aleatorios1.add(54);
        Aleatorios2.add(0,54);
        Aleatorios1.add(26);
        Aleatorios2.add(0,26);
        Aleatorios1.add(65);
        Aleatorios2.add(0,65);
        Aleatorios1.add(69);
        Aleatorios2.add(0,69);
        Aleatorios1.add(26);
        Aleatorios2.add(0,26);
        Aleatorios1.add(60);
        Aleatorios2.add(0,60);
        Aleatorios1.add(71);
        Aleatorios2.add(0,71);
        Aleatorios1.add(16);
        Aleatorios2.add(0,16);
        Aleatorios1.add(32);
        Aleatorios2.add(0,32);
        Aleatorios1.add(46);
        Aleatorios2.add(0,46);
        for(Integer i : Aleatorios1){
            System.out.print(i+" ");
        }
        System.out.println();
        for(Integer i : Aleatorios2){
            System.out.print(i+" ");
        }
    
    //el superior esta hecho desde mi desconocimiento.
        System.out.println("LISTA DE NÚMEROS ALEATORIOS");
        System.out.println("---------------------------");
        System.out.println();

        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                int numAleatorio = (int) (Math.random() * 100);
                System.out.printf ("Añadimos el número %d\n", numAleatorio);
                lista1.add(numAleatorio);
                lista2.add(0, numAleatorio);
                System.out.printf("Lista1:%s\n", lista1);
                System.out.printf("Lista2:%s\n", lista2);
        }

        System.out.println();
        System.out.println("RESULTADO FINAL");
        System.out.println("---------------");
        System.out.printf("Lista1:%s\n", lista1);
        System.out.println();
        System.out.printf("Lista2:%s\n", lista2);
    }
}
