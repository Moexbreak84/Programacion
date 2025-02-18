package EstructuraDatos;

public final class EReader extends Producto {
    private String fabricante;
    public EReader(double precio, String DESCRIPCION) throws IllegalArgumentException {
        super(precio, DESCRIPCION);
        this.fabricante = fabricante;

    }

    public String getFabricante() {
        return fabricante;
    }

    public String toString() {
        return String.format("%s Fabricante: %s", this.toString(), fabricante);
    }

    
}
