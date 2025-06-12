package EstructuraDatos;

public class Naipe {

    private int numero;
    private String carta;

    public Naipe(int numero, String carta) {
        this.numero = numero;
        this.carta = carta;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Naipe{" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }

    public int getPuntuacion() {
    
    }
}
