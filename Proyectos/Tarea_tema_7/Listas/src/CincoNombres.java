import java.util.ArrayList;
import java.util.Iterator;
public class CincoNombres {
    public static void main(String[] args) {
    
        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Moises");
        nombres.add("Fran");
        nombres.add("Pepelu");
        nombres.add("Raquel");
        nombres.add("Julio");
        System.out.println(nombres.getFirst());
        System.out.println(nombres.getLast());
        
        nombres.set(2, "hanza");
        System.out.println(nombres);

        nombres.remove(4);
        System.out.println(nombres);

        nombres.remove("Raquel");
        System.out.println(nombres);

        for(int i = 0; i < nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        
        for (String nombre : nombres) {
            System.out.println(nombres);
        }

        Iterator<String>myItY=nombres.iterator();
        while(myItY.hasNext()){
            System.out.println(myItY.next());
        }
    }
}
