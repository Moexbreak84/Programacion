package EstructuraDatos;

import InterfazUsuario.Audible;

public final class AudioBook extends LibroDigital implements Audible {
    private int duracion;
    private int numVoces;

    public AudioBook(int IDENTIFICADOR, double precio, String DESCRIPCION, String tituloLibro, String autorLibro,
            int anioPublicacion, int size, int numDescargas, int duracion, int numVoces) throws IllegalArgumentException {
        super(IDENTIFICADOR, precio, DESCRIPCION, tituloLibro, autorLibro, anioPublicacion, size, numDescargas);
        this.duracion = duracion;
        this.numVoces = numVoces;
        if (duracion >= 1) {

        } else {
            throw new IllegalArgumentException(String.format("Duracion no valida: %d", duracion));
        }
        if (numVoces >= 1) {

        } else {
            throw new IllegalArgumentException(String.format("Cantidad de voces no valida: %d", numVoces));
        }
    }

    @Override
    public String toString() {
        return String.format("%-14s Tamaño: %-14d Duracion: %-14d NumVoces: %d",
                super.toString(),
                this.getDuracion(),
                this.getNumVoces());
    }

    @Override
    public int descargar() {
        int incremento = 1;
        if(size + incremento <= MAX_SIZE){
            size = size + incremento;
        }
        return super.descargar();
        
    }

    @Override
    public int getDuracion() {
        return this.duracion = duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public int getNumVoces() {
        return this.numVoces;
    }

    public void setNumVoces(int numVoces) {
        this.numVoces = numVoces;
    }

    @Override
    public boolean isCoral() {
        return numVoces >= 2;
    }

    @Override
    public boolean isMonologo() {
        return numVoces == 1;
    }

}
