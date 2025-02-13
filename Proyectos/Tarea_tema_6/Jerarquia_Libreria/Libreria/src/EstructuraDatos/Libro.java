package EstructuraDatos;

public abstract class Libro extends Producto {
    private String tituloLibro;
    private String autorLibro;
    private int anioPublicacion;
    private final int MIN_ANIO = 1500;

    public libro(double precio, String DESCRIPCION, String tituloLibro, String autorLibro, int anioPublicacion){
        super(precio, DESCRIPCION);
        if(anioPublicacion >= MIN_ANIO){

        }
    }

    public String getTituloLibro() {

    }

    public String getAutorLibro() {

    }

    public int getAnioPublicacion() {

    }

}
