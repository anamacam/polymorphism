package superclase;

import java.util.Date;

public class ArticuloCanastaBasica extends Articulo{

    public ArticuloCanastaBasica(String identificador, String nombre, double costo, Date fechaVencimiento, boolean canastaBasica) {
        super(identificador, nombre, costo, fechaVencimiento, canastaBasica);
    }

    @Override
    public double obtenerPrecio() {

        return costo * GANANCIA;
    }
}
