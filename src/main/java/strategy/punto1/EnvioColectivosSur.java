package strategy.punto1;

public class EnvioColectivosSur implements Envio{
    @Override
    public double calcularCosto(String destino, double pesoTotalKg) {
        double costoFijo;
        switch (destino.toLowerCase()) {
            case "capital federal":
                costoFijo = 1000;
                break;
            case "gran buenos aires":
                costoFijo = 1500;
                break;
            default:
                costoFijo = 3000;
        }
    double adicional = 0;
        if (pesoTotalKg > 5 && pesoTotalKg <= 30) {
        adicional = 500;
    } else if (pesoTotalKg > 30) {
        adicional = 2000;
    }
        return costoFijo + adicional;
}
}
