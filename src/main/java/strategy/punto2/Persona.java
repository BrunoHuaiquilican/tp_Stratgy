package strategy.punto2;

import java.time.LocalDate;

public class Persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private FormateadorFecha estrategia;

    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setEstrategia(FormateadorFecha estrategia) {
        this.estrategia = estrategia;
    }

    public String fechaNacimiento() {
        return estrategia.formatear(fechaNacimiento);
    }
}