package estructuraDatos;

public class Bombilla {
    private static int cantidadBombillas;
    private static int bombillasEncendidas;
    private boolean estado;
    private int vecesEncedida;
    private static final boolean ESTADO_POR_DEFECTO = false;
    
    public Bombilla (boolean estadoInicial){
        this.estado = estadoInicial;
        if(estadoInicial == true){
            vecesEncedida = 1;
            bombillasEncendidas++;
        }else{
            vecesEncedida = 0;
        }
        cantidadBombillas++;
    }
    public Bombilla() {
        this.estado = false;
        vecesEncedida = 0;
        cantidadBombillas++;
    }
    public boolean getEstado(){
        return this.estado;
    }
    public int vecesEncedida(){
        return this.vecesEncedida;
    }
    public static int getCantidadBombillas(){
        return Bombilla.cantidadBombillas;
    }
    public static int getbombillasEncendidas(){
        return Bombilla.bombillasEncendidas;
    }
    @Override
    public String toString(){
        String mensaje;

        if(estado){
            mensaje = "Bombilla encendida. ";
        }else{
            mensaje = "Bombilla apagada. ";
        }
        mensaje += "Se ha encendido " + vecesEncedida;

        if(vecesEncedida == 1){
            mensaje += "vez.";
        }else{
            mensaje += "veces.";
        }
        return mensaje;

    }
    /**
     * 
     * @throws IllegalStateException
     */
    public void encender()throws IllegalStateException {
        if(!this.estado){
            this.estado = true;
            this.vecesEncedida++;
            this.bombillasEncendidas++;
        }else{
            throw new IllegalStateException("intentando encender bombilla ya encendida");
        }
    }
    public void apagar () throws IllegalStateException  {
        if ( !this.estado ) {
          throw new IllegalStateException ("Intentando apagar bombilla apagada");
        } else {
          this.estado= false; 
          Bombilla.bombillasEncendidas--; 
      }
    }
}