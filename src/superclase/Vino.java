package superclase;

import java.util.Date;

public class Vino extends ArticuloCanastaNoBasica {
    private int añejamiento;

    public Vino(String identificador, String nombre, double costo, Date fechaVencimiento, int añejamiento) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.añejamiento = añejamiento;
    }
    @Override
    public double obtenerPrecio() {
        double precioFinal = super.obtenerPrecio();
        int multiplicador = calcularMultiplicador();
        double porcentajeAdicional = multiplicador /10;
        return precioFinal + (precioFinal * (multiplicador/ 10));
    }
    private int calcularMultiplicador() {
        return añejamiento/ 5;
    }
}
