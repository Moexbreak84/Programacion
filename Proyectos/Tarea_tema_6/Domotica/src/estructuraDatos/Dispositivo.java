package estructuraDatos;

public class Dispositivo {
    protected final int ID;
    protected final String DESCRIPCION;
    protected int ubicacion;
    public Dispositivo (int ID, String DESCRIPCION, int ubicacion){
        this.ID = ID;
        this.DESCRIPCION = DESCRIPCION;
        this.ubicacion = ubicacion;
    
    }

}
