package EstructuraDatos;

public class Baraja {
    private String nombre;

    public Baraja(String nombre) {
        this.nombre = nombre;
    }

    public repartirCarta() {

    }

    public int cartasRestantes() {
        return 0; 
    }

    public String primeraCarta() {
        return "Primera carta de la baraja: " + nombre;
    }

    public copiaPrimeraCarta() {
        return "Copia de la primera carta de la baraja: " + nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
