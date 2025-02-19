package controladores;

import estructuraDatos.Producto;
import utilidades.ES;
public class CProducto {
    private static Producto[] productos = new Producto[100];

    private static int buscarProducto(String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos != null) {
                if (productos[i].getCodigo().equals(codigo)) {
                    return i;
                } else {
                    return -1; 
                }
            }
        }
    }

    private static int primeraPosicionVacia(){
        for(int i = 0; i < productos.length; i++){
            if(productos[i] == null){
                return i;
            }else{
            return -1;
            }
        }
    }

    public static Producto[] obtenerTodosProductos() {
        return productos;
    }

    public static Producto obtenerProducto(int posicion) {
        if(posicion >= 0 && posicion < productos.length){
            return productos[posicion];
        }
        return null;
    }

    public static Producto obtenerProducto(String codigo) {
        int posicion = buscarProducto(codigo);
        if(buscarProducto(codigo)!= -1){
            return productos[posicion];
        }else{
            return null;
        }
    }

    public static String toStringProducto(int){
        
    }

    public static String toStringProducto(String){

    }

    public static boolean agregarProducto(String codigo, String nombre, String descripcion, int unidades,
            float precioCompra) {

    }

    public static boolean quedaEspacioProductos() {

    }

    public static boolean modificarProducto(String codigo, String nombre) {

    }

    public static int posicionRegistroProducto(String codigo) {

    }

    public static boolean modificarCodigoProducto(int unidades, String codigo) {

    }

    public static boolean modificarCodigoProducto(String codigo, String nombre) {

    }

    public static boolean agregarUnidadesProducto(String codigo, int unidades) {

    }

    public static boolean quitarUnidadesProducto(String codigo, int unidades) {

    }

    public static boolean eliminarProducto(int unidades) {

    }

    public static boolean eliminarProducto(String codigo) {

    }

}
