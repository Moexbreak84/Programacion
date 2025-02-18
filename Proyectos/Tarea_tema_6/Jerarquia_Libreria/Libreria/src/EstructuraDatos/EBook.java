package EstructuraDatos;

public final class EBook extends LibroDigital {
    private String codificacion;

    public EBook(int IDENTIFICADOR, double precio, String DESCRIPCION, String tituloLibro, String autorLibro,
            int anioPublicacion, int size, int numDescargas, String codificacion) throws IllegalArgumentException {
        super(IDENTIFICADOR, precio, DESCRIPCION, tituloLibro, autorLibro, anioPublicacion, size, numDescargas);
                this.codificacion = codificacion;
    }

    public String getCodificacion() {
        return codificacion;
    }

    @Override
    public String toString() {
        return String.format("%-14s Codificacion: %-14d",
            super.toString(),
            this.getCodificacion());
    }
   
    @Override
    public int descargar() {
        double incremento = 0.01;
        this.setPrecio(this.getPrecio() + incremento);
        return super.descargar();
    }
}
