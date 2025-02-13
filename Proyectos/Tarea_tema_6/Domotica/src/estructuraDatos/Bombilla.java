package estructuraDatos;

public class Bombilla extends Dispositivo {
    private int intensidad;
    private int numeroVecesManipulada;

    public Bombilla(int ID, String DESCRIPCION, int ubicacion) {
        super(ID, DESCRIPCION, ubicacion);
        this.ID = ID;
        this.DESCRIPCION = DESCRIPCION;
        this.ubicacion = ubicacion;
    }

    public int getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(int intensidad) {
        this.intensidad = intensidad;
    }

    public int getNumeroVecesManipulada() {
        return numeroVecesManipulada;
    }

    public void setNumeroVecesManipulada(int numeroVecesManipulada) {
        this.numeroVecesManipulada = numeroVecesManipulada;
    }

    @Override
    public String toString() {
        return String.format("%s estado:%s int:%d NVM:%d",
                super.toString(), this.getEstado() ? "encendida" : "apagada",
                this.intensidad, this.numVecesManipulada);
    }

}
