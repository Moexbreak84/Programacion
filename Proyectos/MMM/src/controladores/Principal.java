package controladores;

import utilidades.ES;

/**
 * Clase Principal que contiene el método main para ejecutar la aplicación.
 * Esta clase es responsable de interactuar con el usuario y gestionar
 * las operaciones relacionadas con los productos a través de la clase
 * CProducto.
 */
public class Principal {
    public static void main(String[] args) {
        // Instancia de CProducto para gestionar productos
        CProducto cProducto = new CProducto();
        
        // Cargar datos al iniciar la aplicación
        cProducto.cargarDatos();

        boolean salir = false; // Variable para controlar el bucle del menú
        while (!salir) {
            // Mostrar el menú de opciones al usuario
            System.out.println("1. Agregar Producto");
            System.out.println("2. Mostrar Productos");
            System.out.println("3. Modificar Producto");
            System.out.println("4. Eliminar Producto");
            System.out.println("5. Guardar Datos");
            System.out.println("6. Salir");
            
            // Leer la opción seleccionada por el usuario
            int opcion = ES.leerEntero("Seleccione una opción: ");

            // Procesar la opción seleccionada
            switch (opcion) {
                case 1:
                    // Lógica para agregar producto
                    // Aquí se debe implementar la lógica para solicitar los datos del producto
                    // y llamar a cProducto.agregarProducto(producto);
                    break;
                case 2:
                    // Lógica para mostrar productos
                    // Aquí se debe implementar la lógica para mostrar todos los productos
                    // utilizando cProducto.obtenerTodosProductos();
                    break;
                case 3:
                    // Lógica para modificar producto
                    // Aquí se debe implementar la lógica para solicitar el código del producto
                    // y los nuevos datos, luego llamar a cProducto.modificarProducto(codigo, nuevoNombre, nuevaDescripcion, nuevoPrecio);
                    break;
                case 4:
                    // Lógica para eliminar producto
                    // Aquí se debe implementar la lógica para solicitar el código del producto
                    // y llamar a cProducto.eliminarProducto(codigo);
                    break;
                case 5:
                    // Guardar datos en el archivo
                    cProducto.guardarDatos(true); // Guardar datos
                    break;
                case 6:
                    // Guardar datos antes de salir
                    cProducto.guardarDatos(true); // Guardar datos antes de salir
                    salir = true; // Cambiar la variable para salir del bucle
                    break;
                default:
                    // Mensaje de error si la opción no es válida
                    System.out.println("Opción no válida.");
            }
        }
    }