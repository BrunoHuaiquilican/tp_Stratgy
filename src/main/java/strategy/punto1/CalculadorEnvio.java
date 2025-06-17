package strategy.punto1;

public class CalculadorEnvio {

    private Envio estrategia;

    public void setEstrategia(Envio estrategia) {
        this.estrategia = estrategia;

    }

    public double calcular(String destino, double pesoKg) {
        return estrategia.calcularCosto(destino, pesoKg);
    }
}

