package controladores;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import estructuraDatos.Producto;

public class CProducto {
    static TreeSet<Producto> productos = new TreeSet<Producto>();
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
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        return null;
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
    public static void obtenerTodosProductos() {
        ArrayList<Producto> listaProductos = new ArrayList<>(productos);
        listaProductos.sort(Comparator.reverseOrder());
        System.out.println(listaProductos);
    }

    public Producto obtenerProducto(String codigo) {
        return productos.stream().filter(p -> p.getCodigo().equals(codigo)).findFirst().orElse(null);
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
     * Agrega un nuevo producto al conjunto de productos.
     * 
     * @param producto El producto a agregar.
     * @return true si el producto se ha agregado correctamente, false si ya existe.
     */
    public static boolean agregarProducto(Producto producto) {
        if (buscarProducto(producto.getCodigo()) == null) {
            productos.add(producto);
            return true;
        }
        return false;
    }

    /**
     * Elimina un producto del conjunto de productos por su código.
     * 
     * @param codigo El código del producto a eliminar.
     * @return true si el producto se ha eliminado correctamente, false si no se
     *         encuentra.
     */
    public static boolean eliminarProducto(String codigo) {
        Producto producto = buscarProducto(codigo);
        if (producto != null) {
            productos.remove(producto);
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

    @Override
    public int compareTo(Producto otro) {
        // Comparar por código
        return this.codigo.compareTo(otro.codigo);
    }
}