package Proyectos.Tarea_tema4_cadenas.src;

import Proyectos.Tarea_tema4_cadenas.p_cadenas;

public class metodos {
    public static String ofuscacion(String contrasena) {
        StringBuilder ofuscacion = new StringBuilder();
        String salida = "";
        for (char pass : contrasena.toCharArray()) {
            switch (pass) {
                case 'A':
                    salida = salida + "4";
                    break;
                case 'a':
                    salida = salida + '@';
                    break;
                case 'b':
                    salida = salida + '8';
                    break;
                case 'C':
                    salida = salida + "((";
                    break;
                case 'D':
                    salida = salida + "))";
                    break;
                case 'E':
                    salida = salida + '3';
                    break;
                case 'e':
                    salida = salida + '?';
                    break;
                case 'G':
                    salida = salida + '6';
                    break;
                case 'H':
                    salida = salida + '#';
                    break;
                case 'I':
                    salida = salida + '|';
                    break;
                case 'i':
                    salida = salida + '1';
                    break;
                case 'l':
                    salida = salida + '!';
                    break;
                case 'O':
                    salida = salida + '0';
                    break;
                case 'o':
                    salida = salida + '*';
                    break;
                case 'P':
                    salida = salida + '9';
                    break;
                case 'S':
                    salida = salida + "$$";
                    break;
                case 's':
                    salida = salida + '2';
                    break;
                case 'T':
                    salida = salida + '7';
                    break;
                case 't':
                    salida = salida + '+';
                    break;
                case 'V':
                    salida = salida + "\\/";
                    break;
                case 'Y':
                    salida = salida + '&';
                    break;
                default:
                    salida = salida + pass;
            }
        }
        return salida;
    }
}
