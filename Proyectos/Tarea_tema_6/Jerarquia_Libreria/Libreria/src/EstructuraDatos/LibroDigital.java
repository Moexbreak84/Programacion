package EstructuraDatos;

import InterfazUsuario.Descargable;

public abstract class LibroDigital extends Libro implements Descargable {
    protected int size;
    private int numDescargas;
    public final int MIN_SIZE = 20;
    public final int MAX_SIZE = 65535;
    public LibroDigital(int id, double precio, String descripcion, String tituloLibro, String autorLibro,
    int anioPublicacion, int size, int numDescargas) throws IllegalArgumentException{
        super(tituloLibro, precio, descripcion, autorLibro, anioPublicacion);
        if(size >= MIN_SIZE && size <= MAX_SIZE){

        }else{
            throw new IllegalArgumentException(String.format("Tamaño fuera de rango: %d",size));
        }
    }

    @Override
    public int getSize(){
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public int getNumDescargas(){
        return numDescargas;
    }

    public void setNumDescargas(int numDescargas) {
        this.numDescargas = numDescargas;
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
