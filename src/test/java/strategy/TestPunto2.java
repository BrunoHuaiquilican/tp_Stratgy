package strategy;


import org.junit.jupiter.api.Test;
import strategy.punto2.FechaCorta;
import strategy.punto2.FechaLarga;
import strategy.punto2.Persona;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPunto2 {

    @Test
    public void Test01() {

        Persona p = new Persona("Juan", LocalDate.of(1986, 6, 3));

        p.setEstrategia(new FechaCorta());

        assertEquals("3-06-1986" ,p.fechaNacimiento() );

        p.setEstrategia(new FechaLarga());
        assertEquals("3 de junio de 1986" , p.fechaNacimiento());

    }
}
