package superclase;

import java.util.Date;

public class Arroz extends ArticuloCanastaBasica{

    private String tipo;

    public Arroz(String identificador, String nombre, double costo, Date fechaVencimiento,String tipo) {
        super(identificador, nombre, costo, fechaVencimiento, true);
        this.tipo = tipo;
    }
}

