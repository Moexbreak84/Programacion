import aguadulce.Bombo;
import java.util.Scanner;

public class ejercicio {
    public static void Bombo1() {
        Scanner sc = new Scanner(System.in);
        Bombo miBombo = new Bombo();
        int numero1, numero2, numero3, numero4, numero5, bola_fuera, eleccion = 0, bombos;
        boolean leido = false;

        System.out.println("elige un bombo para jugar solo valdran estos 4: 30 - 50 -70 - 90");
        bombos = sc.nextInt();
        miBombo = bombos;
        while (bombos == 30 || bombos == 50 || bombos == 70 || bombos == 90) {
            try {

            } catch (Exception e) {
                System.out.println("Error no se ha puesto un numero correcto");
                sc.next();

            }
            if (eleccion <= bombos) {
                System.out.println("elije el primer numero ");
                eleccion = sc.nextInt();
                numero1 = eleccion;

            } else if (eleccion <= bombos) {
                System.out.println("elije el segundo numero ");
                eleccion = sc.nextInt();
                numero2 = eleccion;

            } else if (eleccion <= bombos) {
                System.out.println("elije el tercer numero ");
                eleccion = sc.nextInt();
                numero3 = eleccion;

            } else if (eleccion <= bombos) {
                System.out.println("elije el cuarto numero ");
                eleccion = sc.nextInt();
                numero4 = eleccion;

            } else if (eleccion <= bombos) {
                System.out.println("elije el quinto numero ");
                eleccion = sc.nextInt();
                numero5 = eleccion;
            }
        }
    }
}
