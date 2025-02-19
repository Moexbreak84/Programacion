package controladores;

import estructuraDatos.Producto;

public class CProducto {
    private static Producto[] productos = new Producto[100];
    private static int contador;

    private static int buscarProducto(String codigo) {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] != null && productos[i].getCodigo().equals(codigo)) {
                return i;
            }
        }
        return -1;
    }

    private static int primeraPosicionVacia() {
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public static boolean agregarProducto(Producto producto) {
        if (contador < productos.length && buscarProducto(producto.getCodigo()) == -1) {
            productos[contador++] = producto;
            return true;
        }
        return false;
    }

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

    public static void mostrarProductos() {
        for (int i = 0; i < contador; i++) {
            if (productos[i] != null) {
                System.out.println(productos[i]);
                System.out.println("-------------------");
            }
        }
    }
}