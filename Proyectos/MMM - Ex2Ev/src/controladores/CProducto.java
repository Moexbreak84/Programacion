package controladores;

import estructuraDatos.Producto;

public class CProducto {
    private static Producto[] productos = new Producto[100];
    private static int contador;

    /**
     * Busca un producto en el array de productos por su código.
     * 
     * @param codigo El código del producto a buscar.
     * @return La posición del producto en el array si se encuentra,
     *         de lo contrario, devuelve -1.
     */
    private static int buscarProducto(String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getCodigo().equals(codigo)) {
                return i;
            } else {
                return -1;
            }
        }
        return contador;
    }

    /**
     * Busca la primera posición vacía en el array de productos.
     * 
     * @return La posición vacía en el array si existe,
     *         de lo contrario, devuelve -1.
     */
    private static int primeraPosicionVacia() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                return i;
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
    public static Producto[] obtenerTodosProductos() {
        return productos;
    }

    /**
     * Obtiene un producto a partir de su posición en el array.
     * 
     * @param posicion La posición del producto en el array.
     * @return El producto en la posición especificada,
     *         o null si la posición es inválida.
     */
    public static Producto obtenerProducto(int posicion) {
        if (posicion >= 0 && posicion < productos.length) {
            return productos[posicion];
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
        int posicion = buscarProducto(codigo);
        if (buscarProducto(codigo) != -1) {
            return productos[posicion];
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
        if (contador < productos.length && buscarProducto(producto.getCodigo()) == -1) {
            productos[contador++] = producto;
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
        int pos = buscarProducto(codigo);
        if (pos != -1) {
            for (int i = pos; i < contador - 1; i++) {
                productos[i] = productos[i + 1];
            }
            productos[--contador] = null;
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
            if (productos[i] != null) {
                System.out.println(productos[i]);
                System.out.println("-------------------");
            }
        }
    }
}