package strategy.punto1;

public class EnvioCorreoArgentino implements Envio {

    private int obtenerDistancia(String destino) {
        // Simulación
        if (destino.equalsIgnoreCase("La Plata")) return 60;
        if (destino.equalsIgnoreCase("Mar del Plata")) return 400;
        return 200; // valor por defecto
    }
    @Override
    public double calcularCosto(String destino, double pesoTotalKg) {
        if (destino.equalsIgnoreCase("capital federal")) {
            return 500;
        } else {
            int distancia = obtenerDistancia(destino);
            return 800 + (5 * distancia);
        }
    }
}