import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
public class CincoLetras {
    public static void main(String[] args) {
        ArrayList<Character> letras = new ArrayList<>();
        letras.add('a');
        letras.add('b');
        letras.add('c');
        letras.add('d');
        letras.add('f');
        for(int i = letras.size()-1; i >= 0; i--){
            System.out.println(letras.get(i));
        }

        ListIterator<Character>myIty=letras.listIterator(letras.size());
        while (myIty.hasPrevious()) {
            System.out.println(myIty.previous());
            
        }
    }
}
