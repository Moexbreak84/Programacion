package controladores;

import estructuraDatos.*;
import controladores.CProducto;
import enumerados.Categoria;
import enumerados.TipoMedicamento;
import utilidades.ES;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        CProducto manager = new CProducto();
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Agregar Medicamento");
            System.out.println("2. Agregar Parafarmacia");
            System.out.println("3. Mostrar Productos");
            System.out.println("4. Salir");
            int opcion = ES.leerEntero("Seleccione una opción: ");

            switch (opcion) {
                case 1:
                    String codigo = ES.leerString("Ingrese el código: ");
                    String nombre = ES.leerString("Ingrese el nombre: ");
                    String descripcion = ES.leerString("Ingrese la descripción: ");
                    double precio = ES.leerDouble("Ingrese el precio: ");
                    int unidades = ES.leerEntero("Ingrese las unidades: ");
                    TipoMedicamento tipoMedicamento = TipoMedicamento.ANALGESICOS; // Ejemplo
                    String comoTomar = ES.leerString("Ingrese cómo tomar: ");
                    String efectosAdversos = ES.leerString("Ingrese efectos adversos: ");
                    Medicamento medicamento = new Medicamento(codigo, nombre, descripcion, precio, unidades,
                            tipoMedicamento, comoTomar, efectosAdversos);
                    if (CProducto.agregarProducto(medicamento)) {
                        System.out.println("Medicamento agregado exitosamente.");
                    } else {
                        System.out.println("Error al agregar el medicamento.");
                    }
                    break;
                case 2:
                    String codigoP = ES.leerString("Ingrese el código: ");
                    String nombreP = ES.leerString("Ingrese el nombre: ");
                    String descripcionP = ES.leerString("Ingrese la descripción: ");
                    double precioCompraP = ES.leerDouble("Ingrese el precio: ");
                    int unidadesP = ES.leerEntero("Ingrese las unidades: ");
                    Categoria categoria = Categoria.BOTIQUIN; // Ejemplo
                    int dosisUnidades = ES.leerEntero("Ingrese dosis unidades: ");
                    double descuento = ES.leerDouble("Ingrese descuento: ");
                    Parafarmacia parafarmacia = new Parafarmacia(codigoP, nombreP, descripcionP, unidadesP,
                            precioCompraP,
                            categoria, dosisUnidades, descuento);
                    if (CProducto.agregarProducto(parafarmacia)) {
                        System.out.println("Parafarmacia agregada exitosamente.");
                    } else {
                        System.out.println("Error al agregar la parafarmacia.");
                    }
                    break;
                case 3:
                    CProducto.mostrarProductos();
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