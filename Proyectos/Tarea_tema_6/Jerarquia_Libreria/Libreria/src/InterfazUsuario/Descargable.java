package InterfazUsuario;

public interface Descargable {
    private int contador = 0;

    public int getSize() {
        return size;
    }

    public int getNumDescargas() {
        return numDescargas;
    }

    public int descargar() {
        contador++;
        numDescargas = contador;
        return numDescargas;
    }

}
