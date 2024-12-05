/* Ejercicio 1: En algunas ocasiones, nuestras contraseñas pueden resultar fácilmente predecibles frente a ataques de diccionario, de manera que se aplican diversas técnicas para evitar ese tipo de vulnerabilidad.

Una de estas técnicas consiste en "ofuscar" u "oscurecer" la contraseña, sustituyendo algunos caracteres por otros para que si se trata de una palabra que aparece en un diccionario o lista de posibles contraseñas, ya no sea la misma palabra. De esta manera se le ofrece al usuario una versión algo más "difícil de adivinar" respecto a su contraseña original para que la use como alternativa.

Por ejemplo, imagina la contraseña "CASANDRA". Esta expresión podría aparecer fácilmente en una lista de palabras o diccionario de tamaño medio. Si sustituimos la "C" por "((", la "A" por "4", la "S" por " "yla"D"por"))",obtendríamos"((4
 4N))R4", que no se parece en nada a la "CASANDRA" original (ni siquiera en el número de caracteres).

La tabla de ofuscación que vamos a utilizar será la siguiente:



A partir de este planteamiento, escribe un programa en Java que lea una lista de contraseñas (array de String), rellene una nueva lista (otro array de String) con esas contraseñas ofuscadas y finalmente las muestre por pantalla. La lista (array) de contraseñas que tendrás que ofuscar es la siguiente: "Paella", "Vampiro", "CASANDRA", "DOdo", "GABOSVE", "HIPOlito", "AEGYPTOS", "ISISisis". Puedes copiarla y pegarla directamente a tu código para declarar el array de entrada ya relleno.

Para implementar tu programa tendrás que:

Declarar el array de entrada, relleno con las contraseñas que van a ser ofuscadas.
Declarar el array de resultados, de tamaño indefinido, con su contenido sin rellenar.
Reservar espacio para el array de resultados, que será del mismo tamaño que el array de entrada. No debes utilizar un literal para indicar su tamaño, sino que debes calcular el tamaño del array de entrada para que si este cambiara de tamaño no hubiera que modificar nada más.
Recorrer cada uno de los elementos del array de contraseñas.
Para cada contraseña, habrá que analizar cada uno de sus caracteres. Lo más sencillo es ir recorriendo cada carácter mediante un bucle.
Si alguno de sus caracteres coincide con los de la tabla de ofuscación, habrá que llevar a cabo la sustitución apropiada y seguir analizando hasta llegar al final. Puedes hacerlo, por ejemplo, con una instrucción switch, con un case para cada carácter "ofuscable".
Una vez finalizado el análisis y transformación de la contraseña original a la contraseña ofuscada, almacenar esa contraseña ofuscada en el array de resultados o de salida.
Una vez transformadas todas las contraseñas y almacenadas en el array de resultados, recorrer cada uno de esos elementos y mostrarlos por pantalla. Cada resultado debe colocarse en una línea diferente y numerada, comenzando por 1, con el siguiente formato: Contraseña Original -> Contraseña ofuscada*/
package Proyectos.Tarea_tema4_cadenas.src;

public class ejercicio1 {
    public static void main(String[] args) {
        String[] contrasena = { "Paella", "Vampiro", "CASANDRA", "DOdo", "GABOSVE", "AEGYPTOS", "ISISisis" };
        String[] resultados = new String[contrasena.length];
        for (int i = 0; i < contrasena.length; i++) {
            resultados[i] = metodos.ofuscacion(contrasena[i]);
        }
        for (int i = 0; i < contrasena.length; i++) {
            System.out.println(i + 1 + ". " + contrasena[i] + " " + "->" + " " + resultados[i]);
        }
    }
}
