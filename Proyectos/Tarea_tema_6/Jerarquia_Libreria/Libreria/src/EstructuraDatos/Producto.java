package EstructuraDatos;

public abstract class Producto {
    public static final double MIN_PRECIO = 0.01;
    public static final double MAX_PRECIO = 10000.00;
    private final int id;
    private int nextId = 1;
    protected double precio;
    private final String descripcion;

    public Producto(double precio, String descripcion) throws IllegalArgumentException {
        if(precio >= MIN_PRECIO && precio <= MAX_PRECIO){
            this.id = nextId++;
            this.precio = precio;
            this.descripcion = descripcion;
        }else{
            throw new IllegalArgumentException(String.format("El precio no esta en el rango permitido: %f", precio));
            //throw new IllegalArgumentException(String.format("El precio no esta en el rango permitido: %f", precio));
        }
    }

    public int getIdentificador() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    

    public String getDescripcion() {
        return descripcion;
    }

    public String toString() {
        return String.format("Tipo: %S Id %d Precio: %9.2f Descripcion: %s", this.getClass().getSimpleName(),
                this.id, this.precio, this.descripcion);
    }

}
