package EstructuraDatos;

public final class LibroFisico extends Libro {
    private int numPaginas;
    private final int MIN_PAGINAS = 20;
    private final int MAX_PAGINAS = 5000;

    public LibroFisico(int id, double precio, String descripcion, String tituloLibro, String autorLibro,
            int anioPublicacion, int numPaginas) {
        super(tituloLibro, precio, descripcion, autorLibro, anioPublicacion);
        if (numPaginas < MIN_PAGINAS || numPaginas > MAX_PAGINAS) {
            throw new IllegalArgumentException("Número de páginas fuera del rango permitido: " + numPaginas);
        }

        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public LibroFisico(int id, String tituloLibro, double precio, String descripcion, String autorLibro,
            int anioPublicacion)
            throws IllegalArgumentException {
        super(tituloLibro, precio, descripcion, autorLibro, anioPublicacion);
    }

    @Override
    public String toString() {
        return String.format("%-14s NumPaginas %d",
                super.toString(),
                this.getNumPaginas());
    }
}
