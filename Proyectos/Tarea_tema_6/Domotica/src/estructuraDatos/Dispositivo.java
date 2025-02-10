package estructuraDatos;

public class Dispositivo {
    protected final int ID;
    protected final String DESCRIPCION;
    protected int ubicacion;

    public Dispositivo(int ID, String DESCRIPCION, int ubicacion) {
        this.ID = ID;
        this.DESCRIPCION = DESCRIPCION;
        this.ubicacion = ubicacion;

    }

    @Override
    public String toString() {
        return String.format("tipo:%-11s id:%d descripción:\"%s\" ubicacion:%d",
                this.getClass().getSimpleName(), this.ID, this.DESCRIPCION, this.ubicacion);
    }

}
