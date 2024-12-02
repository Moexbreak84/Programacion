import java.util.Scanner;

public class Tiempo_Profesor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora, minutos, segundos, horaensegundos, trayecto;
        int llegadaensegundos, horadellegada, minutosdellegada, segundosdellegada

        System.out.print("Indique la hora en la que sale el profesor: ");
        hora = teclado.nextInt();

        System.out.print("seguimos con los minutos: ");
        minutos = teclado.nextInt();

        System.out.print("y seguimos con los segundos: ");
        segundos = teclado.nextInt();
        
        System.out.print("por ultimo indicamos los segundos que tarda en el trayecto: ");
        trayecto = teclado.nextInt();

        horaensegundos = hora * 3600 + minutos * 60 + segundos;
        llegadaensegundos = horaensegundos + trayecto;

        horadellegada = llegadaensegundos / 3600;

        llegadaensegundos = llegadaensegundos % 3600;
        minutosdellegada = llegadaensegundos / 60;
        segundosdellegada = llegadaensegundos % 60;

        System.out.println("la hora de llegada del profesor es " + horadellegada + ":" + minutosdellegada ":" + segundosdellegada);

        teclado.close();

    }
    
}
