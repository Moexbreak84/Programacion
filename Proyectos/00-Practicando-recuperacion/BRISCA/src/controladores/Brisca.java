package controladores;
import EstructuraDatos.Jugable;

public class Brisca implements Jugable{
    public String Brisca(){
        return "Brisca";
    }

    private boolean ronda(boolean turno) {
        return turno; 
    }

    private boolean ganadorMano(Naipe naipe, Naipe naipe, boolean) {
        return true;
    }

    private void repartir( ) {
        
    }
}
