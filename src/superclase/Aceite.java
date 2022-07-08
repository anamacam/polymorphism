package superclase;

import java.util.Date;

public class Aceite extends ArticuloCanastaBasica{

    private String tipo;


    public Aceite(String identificador, String nombre, double costo, Date fechaVencimiento, String tipo) {
        super(identificador, nombre, costo, fechaVencimiento, true);
        this.tipo = tipo;
    }

}
