package Proyectos.Tarea_tema4_cadenas;

public class p_cadenas {
    public static void main(String[] args) {
        String cad1 = "¡Bien";
        String cad2 = "venido!";
        String cadResultado = cad1.concat(cad2);

        System.out.print(cadResultado);
        String cad = "¡Bien".concat("venido!");
        System.out.printf(cad);
        // La variable numero, de tipo int, contiene el entero 1223.
        // Al tratarse de un tipo primitivo y no referencia, sí "contiene" el número y
        // no "apunta" a una zona de memoria que contiene el número
        int numero = 123;
        // La variable cadena contendrá el texto "Número: 1223"
        // llevándose a cabo una conversión a texto del contenido la variable número
        String cadena = "Número: " + numero; // automáticamente se "envuelve" numero en un objeto Integer y se le aplica
                                             // el método toString
        // Se mostrará por pantalla el texto "Número: 1223"
        System.out.println(cadena);
    }
}
