package EstructuraDatos;

public abstract class Jugador {
    private String nombre;

    public jugador(String nombre) {
        this.nombre = nombre;
    }

    public void recibirCarta(Naipe naipe) {

    }

    public void cartaGanada(Naipe... naipe) {

    }

    public String getNombre() {
        return nombre;
    }

    public String getMano(String mano) {
        return mano;
    }

    public int getPuntos() {
        return 0;
    }

    public int jugarCarta() {
        return naipe;
    }

}
