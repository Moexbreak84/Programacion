public class CProducto {
    public static String[] datosProductos = new String[100];
    private static int buscarProducto(String codigo ){ 
        for(int i = 0; i < datosProductos.length; i++){
            if (codigo == i){
                return i;
            }else{
                return -1;
            }
                
            }
        }
        this.codigo =codigo;
        return codigo;
    }
    private static int primeraPosicionVacia(){
        for(int i = 0; i < datosProductos.length; i++){
            if(datosProductos == null)
            return i;
        }
        else{
            return -1;
        }

    }
    public static Producto obtenerTodosProductos(){

    }
    public static Producto obtenerProducto(int Producto){

    }
    public static Producto obtenerProducto(String Producto){

    }
    public static String toStringProducto(int){

    }
    public static String toStringProducto(String){

    }
    public static boolean agregarProducto(String codigo, String nombre, Sting descripcion, int unidades, float precioCompra){

    }
    public static boolean quedaEspacioProductos(){

    }
    public static boolean modificarProducto(String codigo, String nombre){

    }
    public static int posicionRegistroProducto(String codigo){

    }
    public static boolean modificarCodigoProducto(int unidades, String codigo){

    }
    public static boolean modificarCodigoProducto(String codigo, String nombre){

    }
    public static boolean agregarUnidadesProducto(String codigo, int unidades){

    }
    public static boolean quitarUnidadesProducto(String codigo, int unidades){

    }
    public static boolean eliminarProducto(int unidades){

    }
    public static boolean eliminarProducto(String codigo){

    }

}
