package controladores;

import controladores.CProducto;
import enumerados.TipoMedicamento;
import estructuraDatos.*;
import utilidades.ES;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CProducto manager = new CProducto();
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Mostrar Productos");
            System.out.println("4. Salir");
            int opcion = ES.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    String codigo = ES.leerString("Introduce el código del producto: ");
                    String nombre = ES.leerString("Introduce el nombre del producto: ");
                    String descripcion = ES.leerString("Introduce la descripción del producto: ");
                    double precio = ES.leerDouble("Introduce el precio del producto: ");
                    int unidades = ES.leerEntero("Introduce las unidades del producto: ");
                    float precioUnidad = ES.leerFloat();
                    Producto producto = new Parafarmacia(codigo, nombre, descripcion, unidades, opcion, null, unidades, precioUnidad);
                    if (manager.agregarProducto(producto)) {
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("Error al agregar el producto.");
                    }
                    break;
                case 2:
                    String codigoEliminar = ES.leerString("agrega el código del producto a eliminar: ");
                    if (manager.eliminarProducto(codigoEliminar)) {
                        System.out.println("Producto eliminado exitosamente.");
                    } else {
                        System.out.println("Error al eliminar el producto.");
                    }
                    break;
                case 3:
                    manager.mostrarProductos();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}