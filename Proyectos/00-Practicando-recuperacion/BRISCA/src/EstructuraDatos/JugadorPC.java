package EstructuraDatos;
public class JugadorPC extends Jugador {
    private String dificultad;

    public JugadorPC(String nombre) {
        super(nombre);
    }

    public int jugarCarta(int naipe) {
        return naipe;
    }

    public String getDificultad() {
        return dificultad;
    }

}
