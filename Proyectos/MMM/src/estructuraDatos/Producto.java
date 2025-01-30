package estructuraDatos;

public class Producto {
    private String codigo;
    private String nombre;
    private String descripcion;
    private int unidades;
    private float precioCompra;
    public Producto (String codigo, String nombre, String descripcion, int unidades, float precioCompra) {
        Producto primero;
        if(precioCompra > 0){
            primero < 0;
            primero = 0;

        }
    }

    public void setcodigo(String codigo){
        this.codigo = codigo;
    }
    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    public void setdescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public void setunidades(int unidades){
        this.unidades = unidades;
    }
    public void setprecioCompra(float precioCompra){
        this.precioCompra = precioCompra;
    }
    public String codigo(){
        return this.codigo;
    }
    public String getnombre(){
        return this.nombre;
    }
    public String getdescripcion(){
        return this.descripcion;
    }
    public int getunidades(){
        return this.unidades;
    }
    public float getprecioCompra(){
        return this.precioCompra;
    }
    public String toString(){
        String Datos;
        Datos = "Producto\n--------\nCodigo: "+codigo+"\nNombre: "+nombre+"\nDescripcion: "+descripcion+"\nUnidades: "+unidades+"\nPrecio: "+precioCompra;
        return Datos;
    }
    private boolean validarCodigo(String codigo){
        codigo
    }
}
