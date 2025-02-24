import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.LinkedList;
public class Semana {
    public static void main(String[] args) {
        ArrayList<DayOfWeek> listaDays = new ArrayList<>();
        for(int i =0; i < 5; i++){
            int aleatorio = 1+(int)(Math.random()*7);
            final DayOfWeek diaSem = DayOfWeek.of(aleatorio)0;
            listaDays.add(diaSem);
        }
    }
}
