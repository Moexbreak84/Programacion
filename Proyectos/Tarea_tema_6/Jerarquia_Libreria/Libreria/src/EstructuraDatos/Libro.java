package EstructuraDatos;

public abstract class Libro extends Producto {
    private String tituloLibro;
    private String autorLibro;
    private int anioPublicacion;
    private final int MIN_ANIO = 1500;

    public Libro(int id, double precio, String descripcion, String tituloLibro, String autorLibro, int anioPublicacion) throws IllegalArgumentException {
        super(precio, descripcion);
        if(anioPublicacion >= MIN_ANIO){

        }else{
            throw new IllegalArgumentException(String.format("Año fuera de rango: %d",anioPublicacion));
        }
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Libro(String titulo, double precio, String descripcion, String autorLibro, int anioPublicacion)
            throws IllegalArgumentException {
        super(precio, descripcion);
    }

    @Override
    public String toString() {
        return String.format("%-14s titulo: %-14s autor:%-14s año:%-4d",
                super.toString(),
                this.getTituloLibro(),
                this.getAutorLibro(),
                this.getAnioPublicacion());
    }

}
