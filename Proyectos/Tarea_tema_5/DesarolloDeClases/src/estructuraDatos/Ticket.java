package estructuraDatos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Ticket {
    private static short anioActual = (short) LocalDate.now().getYear();
    private final LocalDate fecha;
    private LocalTime usado;
    private final int TIQUET_MAXIMO = 99999999;
    private String ticket;
    private static int acumulador;
    public Ticket() {
        for(int i = 0; i <= TIQUET_MAXIMO; i++){
            ticket = ANIO_ACTUAL - i;
            
        }
        return ticket;
    }
    public static Ticket(String){

    }
    
}
