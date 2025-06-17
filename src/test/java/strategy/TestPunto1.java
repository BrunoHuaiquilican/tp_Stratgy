package strategy;

import org.junit.jupiter.api.Test;
import strategy.punto1.CalculadorEnvio;
import strategy.punto1.EnvioColectivosSur;
import strategy.punto1.EnvioCorreoArgentino;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPunto1 {

    @Test
    public void Test01() {

        CalculadorEnvio calculador = new CalculadorEnvio();

        calculador.setEstrategia(new EnvioColectivosSur());

        assertEquals(1500 ,calculador.calcular("Capital Federal", 10) );

        calculador.setEstrategia(new EnvioCorreoArgentino());
        assertEquals(2800 , calculador.calcular("Mar del Plata", 2) );
    }
}
