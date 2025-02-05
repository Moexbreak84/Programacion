package estructuraDatos;

public class Cerradura extends Dispositivo {
    private boolean estado;
    public String toStringEstado(){
        return String.format("La cerradura "+this.ID+", ubicada en la estancia "+this.ubicacion+" se encuentra "+ this.estado);
    }
    
}
