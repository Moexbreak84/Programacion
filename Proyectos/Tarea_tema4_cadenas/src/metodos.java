package Proyectos.Tarea_tema4_cadenas.src;

import Proyectos.Tarea_tema4_cadenas.p_cadenas;

public class metodos {
    public static String ofuscacion(String contraseña) {
        StringBuilder ofuscacion = new StringBuilder();
        for (char pass : ofuscacion.toCharArray()) {
            switch (pass) {
                case 'A':
                    ofuscacion.append('4');
                    break;
                case 'a':
                    ofuscacion.append('@');
                    break;
                case 'b':
                    ofuscacion.append('8');
                    break;
                case 'C':
                    ofuscacion.append('<');
                    break;
                case 'D':
                    ofuscacion.append('>');
                    break;
                case 'E':
                    ofuscacion.append('3');
                    break;
                case 'e':
                    ofuscacion.append('?');
                    break;
                case 'G':
                    ofuscacion.append('6');
                    break;
                case 'H':
                    ofuscacion.append('#');
                    break;
                case 'I':
                    ofuscacion.append('|');
                    break;
                case 'i':
                    ofuscacion.append('1');
                    break;
                case 'l':
                    ofuscacion.append('!');
                    break;
                case 'O':
                    ofuscacion.append('0');
                    break;
                case 'o':
                    ofuscacion.append('*');
                    break;
                case 'P':
                    ofuscacion.append('9');
                    break;
                case 'S':
                    ofuscacion.append('$');
                    break;
                case 's':
                    ofuscacion.append('2');
                    break;
                case 'T':
                    ofuscacion.append('7');
                    break;
                case 't':
                    ofuscacion.append('+');
                    break;
                case 'V':
                    ofuscacion.append('/');
                    break;
                case 'Y':
                    ofuscacion.append('&');
                    break;
                default:
                    ofuscacion.toString();
            }
        }
    }
}
