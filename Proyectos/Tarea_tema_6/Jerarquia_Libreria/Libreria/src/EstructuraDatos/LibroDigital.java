package EstructuraDatos;

import InterfazUsuario.Descargable;

public abstract class LibroDigital extends Libro implements Descargable {
    protected int size;
    private int numDescargas;
    public final int MIN_SIZE = 20;
    public final int MAX_SIZE = 65535;
    public LibroDigital(int IDENTIFICADOR, double precio, String DESCRIPCION, String tituloLibro, String autorLibro,
    int anioPublicacion, int size, int numDescargas) throws IllegalArgumentException{
        super(tituloLibro, precio, DESCRIPCION, autorLibro, anioPublicacion);
        if(size >= MIN_SIZE && size <= MAX_SIZE){

        }else{
            throw new IllegalArgumentException(String.format("Tamaño fuera de rango: %d",size));
        }
    }

    @Override
    public int getSize(){
        return size;
    }

    @Override
    public int getNumDescargas(){
        return numDescargas;
    }

    @Override
    public String toString() {
        return String.format("%-14s Tamaño: %-14d Numero Descargas:%-14d",
                super.toString(),
                this.getSize(),
                this.getNumDescargas());
    }

    @Override
    public int descargar() {
        numDescargas++;
        return numDescargas;
    }


}
