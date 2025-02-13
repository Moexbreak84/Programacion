package EstructuraDatos;

public abstract class Producto {
    private final double MIN_PRECIO = 0.01;
    private final double MAX_PRECIO = 10000.00;
    private final int IDENTIFICADOR;
    protected double precio;
    private final String DESCRIPCION;

    public Producto(double precio, String DESCRIPCION){
        if(precio >= MIN_PRECIO && precio <= MAX_PRECIO){
            try {
                this.precio;
                this.DESCRIPCION;
                
            } catch (IllegalArgumentException e) {
    
            }

        }
    }

    public int getIdentificador() {
        return IDENTIFICADOR;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return DESCRIPCION;
    }

    public String toString() {
        return String.format("Tipo: %S Id %d Precio: %9.2f Descripcion: %s", this.getClass().getSimpleName(),
                this.IDENTIFICADOR, this.precio, this.DESCRIPCION);
    }

}
