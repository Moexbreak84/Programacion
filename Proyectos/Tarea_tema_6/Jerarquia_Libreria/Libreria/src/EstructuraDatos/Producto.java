package EstructuraDatos;

public abstract class Producto {
    private final double MIN_PRECIO = 0.01;
    private final double MAX_PRECIO = 10000.00;
    private final int ID;
    private int nextId = 1;
    protected double precio;
    private final String DESCRIPCION;

    public Producto(double precio, String DESCRIPCION) throws IllegalArgumentException {
        if(precio >= MIN_PRECIO && precio <= MAX_PRECIO){
            this.ID = nextId++;
            this.precio = precio;
            this.DESCRIPCION = DESCRIPCION;
        }else{
            throw new IllegalArgumentException(String.format("El precio no esta en el rango permitido: %f", precio));
            //throw new IllegalArgumentException(String.format("El precio no esta en el rango permitido: %f", precio));
        }
    }

    public int getIdentificador() {
        return ID;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return DESCRIPCION;
    }

    public String toString() {
        return String.format("Tipo: %S Id %d Precio: %9.2f Descripcion: %s", this.getClass().getSimpleName(),
                this.ID, this.precio, this.DESCRIPCION);
    }

}
