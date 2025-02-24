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
    }
}
