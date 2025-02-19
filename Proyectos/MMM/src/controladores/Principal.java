import controladores.CProducto;
import estructuraDatos.Producto;
import utilidades.ES;

public class Principal {
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
                    String codigo = ES.leerString("Ingrese el código del producto: ");
                    String nombre = ES.leerString("Ingrese el nombre del producto: ");
                    String descripcion = ES.leerString("Ingrese la descripción del producto: ");
                    double precio = ES.leerDouble("Ingrese el precio del producto: ");
                    int unidades = ES.leerEntero("Ingrese las unidades del producto: ");
                    Producto producto = new Producto(codigo, nombre, descripcion, precio, unidades);
                    if (manager.agregarProducto(producto)) {
                        System.out.println("Producto agregado exitosamente.");
                    } else {
                        System.out.println("Error al agregar el producto.");
                    }
                    break;
                case 2:
                    String codigoEliminar = ES.leerString("Ingrese el código del producto a eliminar: ");
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