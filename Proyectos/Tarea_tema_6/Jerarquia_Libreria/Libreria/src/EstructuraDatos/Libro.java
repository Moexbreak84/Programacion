package EstructuraDatos;

public abstract class Libro extends Producto {
    private String tituloLibro;
    private String autorLibro;
    private int anioPublicacion;
    private final int MIN_ANIO = 1500;

    public libro(int IDENTIFICADOR, double precio, String DESCRIPCION, String tituloLibro, String autorLibro, int anioPublicacion) throws IllegalArgumentException {
        super (IDENTIFICADOR, precio, descripcion);
        if(anioPublicacion >= MIN_ANIO){

        }
    }

    public String getTituloLibro() {

    }

    public String getAutorLibro() {

    }

    public int getAnioPublicacion() {

    }

    public Libro(String titulo, double precio, String descripcion, String autor, int year)
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
