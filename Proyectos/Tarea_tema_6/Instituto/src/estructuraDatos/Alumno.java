package estructuraDatos;

public class Alumno extends Persona {
    protected String grupo;
    protected double notaMedia;
    public Alumno(){

    }

    public String getGrupo(){
        return this.grupo;
    }
    
    public void setGrupo(String grupo){
        this.grupo = grupo;
    }

    public double getNotaMedia(){
        return this.notaMedia;
    }

    public void setNotaMedia(double notaMedia){
        this.notaMedia = notaMedia;
    }

    @Override
    public String getNombre(){
        return "Alumno: " + this.nombre;
    }
    
    public String toStringPresentacion(){
        return String.format("El alumno %s %s del grupo %s tiene la nota media de %.2f",this.nombre, this.apellidos, this.grupo, this.notaMedia);
    }

    @Override
    public String toString(){
        String infoPadre = super.toString();
        return String.format("%s\nGrupo: %s\nNota Media: %6.2f puntos", infoPadre, this.grupo, this.notaMedia);
    }
}
