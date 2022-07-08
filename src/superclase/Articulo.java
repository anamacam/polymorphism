package superclase;

import java.util.Date;

public abstract class Articulo {

    public static final double GANANCIA = 1.2;
    protected String identificador;
    protected String nombre;
    protected double costo;
    protected Date fechaVencimiento;
    protected boolean CanastaBasica;

    protected Articulo(String identificador, String nombre, double costo, Date fechaVencimiento, boolean canastaBasica) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.costo = costo;
        this.fechaVencimiento = fechaVencimiento;
        CanastaBasica = canastaBasica;
    }

    public abstract double obtenerPrecio();

    public String getNombre() {
        return nombre;
    }
}
