package estructuraDatos;

public class Cerradura extends Dispositivo {
    private boolean estado;
    public Cerradura(){
        super(ID, DESCRIPCION, ubicacion);
        this.ID = ID;
        this.DESCRIPCION = DESCRIPCION;
        this.ubicacion = ubicacion;
    }
    
    public String toStringEstado(){
        return String.format("la cerradura %d, ubicada en la estancia %d se encuentra en %s",this.ID, this.ubicacion, this.estado ? "cerrada":"abierta");


    }
    
}
