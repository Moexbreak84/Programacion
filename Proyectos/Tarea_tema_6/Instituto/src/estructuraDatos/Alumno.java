package estructuraDatos;

public class Alumno extends Persona {
    protected String grupo;
    protected double notaMedia;
    public String toStringPresentacion(){
        return String.format("El alumno "+this.nombre+" "+this.apellidos+" del grupo "+this.grupo+" tiene la nota media de "+this.notaMedia);
    }
}
