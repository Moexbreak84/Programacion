package estructuraDatos;

public class Profesor extends Persona {
    protected String epecialidad;
    protected double salario;
    public String getEspecialidad(){
        return this.epecialidad;
    }
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;

    }
    public double getSalario(){
        return this.salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }

    @Override
    public String getNombre(){
        return "Profesor: " + this.nombre;
    }

    @Override
    public String toString(){
        String infoPadre = super.toString();
        return String.format("%s\nEspecialidad: %s\nSalario: %7.2f euros", infoPadre, this.epecialidad, this.salario);
    }
}