package controladores;

import estructuraDatos.Producto;
import java.util.TreeSet;

/**
 * Clase CProducto que gestiona un conjunto de productos en una farmacia.
 * Utiliza un TreeSet para almacenar productos de manera única y ordenada.
 */
public class CProducto {
    // Conjunto de productos almacenados
    private TreeSet<Producto> productos = new TreeSet<>(); // Usar TreeSet para mantener productos únicos

    /**
     * Busca un producto en el conjunto por su código.
     *
     * @param codigo El código del producto a buscar.
     * @return La posición del producto en el conjunto si se encuentra, de lo
     *         contrario, devuelve -1.
     */
    private int buscarProducto(String codigo) {
        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return productos.indexOf(producto);
            }
        }
        return -1;
    }

    /**
     * Obtiene la primera posición vacía en el conjunto de productos.
     * 
     * @return La posición vacía si hay espacio, de lo contrario, devuelve -1.
     */
    private int primeraPosicionVacia() {
        return productos.size() < 100 ? productos.size() : -1; // Limitar a 100 productos
    }

    /**
     * Obtiene todos los productos almacenados en el conjunto.
     * 
     * @return Un array de productos que contiene todos los productos.
     */
    public Producto[] obtenerTodosProductos() {
        return productos.toArray(new Producto[0]);
    }

    /**
     * Obtiene un producto a partir de su posición en el conjunto.
     * 
     * @param posicion La posición del producto en el conjunto.
     * @return El producto en la posición especificada, o null si la posición es
     *         inválida.
     */
    public Producto obtenerProducto(int posicion) {
        return (posicion >= 0 && posicion < productos.size()) ? (Producto) productos.toArray()[posicion] : null;
    }

    /**
     * Obtiene un producto a partir de su código.
     * 
     * @param codigo El código del producto a buscar.
     * @return El producto correspondiente al código, o null si no se encuentra.
     */
    public Producto obtenerProducto(String codigo) {
        return productos.stream().filter(p -> p.getCodigo().equals(codigo)).findFirst().orElse(null);
    }

    /**
     * Agrega un nuevo producto al conjunto.
     * 
     * @param producto El producto a agregar.
     * @return true si el producto se ha agregado correctamente, false si ya existe
     *         o no hay espacio.
     */
    public boolean agregarProducto(Producto producto) {
        if (productos.size() < 100 && buscarProducto(producto.getCodigo()) == -1) {
            return productos.add(producto);
        }
        return false;
    }

    /**
     * Verifica si hay espacio disponible para agregar más productos.
     * 
     * @return true si hay espacio, false si no hay espacio disponible.
     */
    public boolean quedaEspacioProducto() {
        return productos.size() < 100;
    }

    /**
     * Modifica los atributos de un producto existente.
     * 
     * @param codigo           El código del producto a modificar.
     * @param nuevoNombre      El nuevo nombre del producto (puede ser vacío si no
     *                         se quiere modificar).
     * @param nuevaDescripcion La nueva descripción del producto (puede ser vacío si
     *                         no se quiere modificar).
     * @param nuevoPrecio      El nuevo precio de compra del producto (debe ser >=
     *                         0).
     * @return true si la modificación se realizó correctamente, false si el
     *         producto no existe.
     */
    public boolean modificarProducto(String codigo, String nuevoNombre, String nuevaDescripcion, float nuevoPrecio) {
        Producto producto = obtenerProducto(codigo);
        if (producto != null) {
            if (!nuevoNombre.isEmpty())
                producto.setNombre(nuevoNombre);
            if (!nuevaDescripcion.isEmpty())
                producto.setDescripcion(nuevaDescripcion);
            if (nuevoPrecio >= 0)
                producto.setPrecioCompra(nuevoPrecio);
            return true;
        }
        return false;
    }

    /**
     * Obtiene la posición de un producto en el conjunto a partir de su código.
     * 
     * @param codigo El código del producto a buscar.
     * @return La posición del producto en el conjunto, o -1 si no se encuentra.
     */
    public int posicionRegistroProducto(String codigo) {
        return buscarProducto(codigo);
    }

    /**
     * Modifica el código de un producto a partir de su posición.
     * 
     * @param posicion    La posición del producto en el conjunto.
     * @param nuevoCodigo El nuevo código del producto.
     * @return true si el código se ha modificado correctamente, false si la
     *         posición es inválida o el nuevo código no es válido.
     */
    public boolean modificarCodigoProducto(int posicion, String nuevoCodigo) {
        Producto producto = obtenerProducto(posicion);
        if (producto != null && Producto.validarCodigo(nuevoCodigo)) {
            producto.setCodigo(nuevoCodigo);
            return true;
        }
        return false;
    }

    /**
     * Modifica el código de un producto a partir de su código antiguo.
     * 
     * @param codigoAntiguo El código antiguo del producto.
     * @param nuevoCodigo   El nuevo código del producto.
     * @return true si el código se ha modificado correctamente, false si el
     *         producto no existe o el nuevo código no es válido.
     */
    public boolean modificarCodigoProducto(String codigoAntiguo, String nuevoCodigo) {
        int posicion = buscarProducto(codigoAntiguo);
        return modificarCodigoProducto(posicion, nuevoCodigo);
    }

    /**
     * Agrega unidades a un producto existente.
     * 
     * @param codigo   El código del producto al que se le agregarán unidades.
     * @param cantidad La cantidad de unidades a agregar (debe ser > 0).
     * @return true si se han agregado las unidades correctamente, false si el
     *         producto no existe o la cantidad es inválida.
     */
    public boolean agregarUnidadesProducto(String codigo, int cantidad) {
        Producto producto = obtenerProducto(codigo);
        if (producto != null && cantidad > 0) {
            producto.agregarUnidades(cantidad);
            return true;
        }
        return false;
    }

    /**
     * Quita unidades de un producto existente.
     * 
     * @param codigo   El código del producto del que se quitarán unidades.
     * @param cantidad La cantidad de unidades a quitar.
     * @return true si se han quitado las unidades correctamente, false si el
     *         producto no existe o no hay suficientes unidades.
     */
    public boolean quitarUnidadesProducto(String codigo, int cantidad) {
        Producto producto = obtenerProducto(codigo);
        if (producto != null && producto.quitarUnidades(cantidad)) {
            return true;
        }
        return false;
    }

    /**
     * Elimina un producto a partir de su posición en el conjunto.
     * 
     * @param posicion La posición del producto en el conjunto.
     * @return true si el producto se ha eliminado correctamente, false si la
     *         posición es inválida.
     */
    public boolean eliminarProducto(int posicion) {
        if (posicion >= 0 && posicion < productos.size()) {
            productos.remove(obtenerProducto(posicion));
            return true;
        }
        return false;
    }

    /**
     * Elimina un producto a partir de su código.
     * 
     * @param codigo El código del producto a eliminar.
     * @return true si el producto se ha eliminado correctamente, false si no se
     *         encuentra.
     */
    public boolean eliminarProducto(String codigo) {
        Producto producto = obtenerProducto(codigo);
        if (producto != null) {
            productos.remove(producto);
            return true;
        }
        return false;
    }
}