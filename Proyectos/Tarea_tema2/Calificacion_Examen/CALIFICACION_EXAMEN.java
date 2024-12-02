import java.util.Scanner;
public class CALIFICACION_EXAMEN {
     public static void main (String[] agrs){
       
        //declaracion de variables
        final int PREGUNTAS_TOTALES =20;
        int aciertos, fallos, total;
        float nota;
        //declarar el escaner
        Scanner sc = new Scanner (System.in);
        //recogida de datos
        System.out.println("introduce cuantas respuestas son correctas");
        aciertos = sc.nextInt();

        System.out.println("introduce cuantas respuestas son incorrectas");
        fallos = sc.nextInt();

        System.out.println("esta es la cantidad de respuestas correctas"+ aciertos + "esta es la cantidad de fallos" + fallos);

        //procesamiento
        total = aciertos + fallos;

        if(aciertos >= 0 && fallos >= 0 && total <= PREGUNTAS_TOTALES){
             nota = (float)(aciertos - fallos *0.5) * 10 / PREGUNTAS_TOTALES;
            
             if (nota < 0){
                nota = 0;
            } else {
                System.out.println("la nota es " + nota);
            }
          
        
            //mostrar resultado
            if (nota < 5) {
                System.out.println("suspenso");
            } else if (nota < 6){
                System.out.println("aprobado");
            } else if (nota < 7){
                System.out.println("bien");
            } else if (nota < 9){
                System.out.println("notable");
            } else {
                System.out.println("sobresaliente");
            }
        } else {
            System.out.println("Datos erroneos");
        }
        sc.close();
    }
}