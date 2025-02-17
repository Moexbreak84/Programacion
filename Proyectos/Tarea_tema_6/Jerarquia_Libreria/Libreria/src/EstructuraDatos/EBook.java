package EstructuraDatos;

public final class EBook extends LibroDigital {
    private String codificacion;

    public EBook(int IDENTIFICADOR, double precio, String DESCRIPCION, String tituloLibro, String autorLibro,
            int anioPublicacion, int size, int numDescargas, String codificacion) throws IllegalArgumentException {
        super(IDENTIFICADOR, precio, DESCRIPCION, tituloLibro, autorLibro, anioPublicacion, size, numDescargas);
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
    
    public EBook(double precio){
        super(precio);
        if(precio + 0.01 < MAX_PRECIO) {
            precio += 0.01
        }
    }

    @Override
    public int descargar() {
        super.descargar();
        double incremento = 0.01;
        this.precio;
        if(numDescargas + 1){
            precio + incremento;
        }
    }

}
