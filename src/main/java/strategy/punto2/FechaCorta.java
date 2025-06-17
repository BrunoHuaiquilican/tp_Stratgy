package strategy.punto2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FechaCorta implements FormateadorFecha {

    public String formatear(LocalDate fecha) {
        return fecha.format(DateTimeFormatter.ofPattern("d-MM-yyyy"));
    }
}

