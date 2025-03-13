package controladores;

import java.util.ArrayList;
import java.util.Comparator;

import estructuraDatos.Producto;

public class CProducto {
    static ArrayList<Producto> productos = new ArrayList<>();
    private static int contador;

    /**
     * Busca un producto en el array de productos por su código.
     * 
     * @param codigo El código del producto a buscar.
     * @return La posición del producto en el array si se encuentra,
     *         de lo contrario, devuelve -1.
     */
    private static Producto buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (productos != null && productos.equals(codigo)) {
                return producto;
            } else {
                return null;
            }
            return codigo;
        }
    }

    /**
     * Busca la primera posición vacía en el array de productos.
     * 
     * @return La posición vacía en el array si existe,
     *         de lo contrario, devuelve -1.
     */
    private static int primeraPosicionVacia() {
        for (Producto producto : productos) {
            if (productos == null) {
                return 1;
            } else {
                return -1;
            }
        }
        return contador;
    }

    /**
     * Obtiene todos los productos almacenados en el array.
     * 
     * @return Un array de productos que contiene todos los productos.
     */
    public static Producto obtenerTodosProductos() {
        productos.sort(Comparator.reverseOrder());
        System.out.println(productos);
    }

    /**
     * Obtiene un producto a partir de su posición en el array.
     * 
     * @param posicion La posición del producto en el array.
     * @return El producto en la posición especificada,
     *         o null si la posición es inválida.
     */
    public static Producto obtenerProducto(int posicion) {
        if (posicion >= 0 && posicion < productos.size()) {
            return productos.size().[posicion];
        }
        return null;
    }

    /**
     * Obtiene un producto a partir de su código.
     * 
     * @param codigo El código del producto a buscar.
     * @return El producto correspondiente al código,
     *         o null si no se encuentra.
     */
    public static Producto obtenerProducto(String codigo) {
        Producto posicion = buscarProducto(codigo);
        if (buscarProducto(codigo) != -1) {
            return posicion;
        } else {
            return null;
        }
    }

    /**
     * Agrega un nuevo producto al array de productos.
     * 
     * @param producto El producto a agregar.
     * @return true si el producto se ha agregado correctamente,
     *         false si no hay espacio o el producto ya existe.
     */
    public static boolean agregarProducto(Producto producto) {
        if (contador < productos.size() && buscarProducto(producto.getCodigo()) == -1) {
            producto = producto;
            return true;
        }
        return false;
    }

    /**
     * Elimina un producto del array de productos por su código.
     * 
     * @param codigo El código del producto a eliminar.
     * @return true si el producto se ha eliminado correctamente,
     *         false si no se encuentra el producto.
     */
    public static boolean eliminarProducto(String codigo) {
        Producto pos = buscarProducto(codigo);
        if (pos != -1) {
            for (Producto i = pos; i < contador - 1; i++) {
                productos = productos<i + 1>;
            }
            productos = null;
            return true;
        }
        return false;
    }

    /**
     * Muestra todos los productos almacenados en el array.
     * Imprime la representación en cadena de cada producto.
     */
    public static void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            if (productos != null) {
                System.out.println(productos);
                System.out.println("-------------------");
            }
        }
    }
}