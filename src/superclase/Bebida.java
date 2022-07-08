package superclase;

import java.util.Date;

public class Bebida extends ArticuloCanastaNoBasica{

    private String tipo;


    public Bebida(String identificador, String nombre, double costo, Date fechaVencimiento, String tipo) {
        super(identificador, nombre, costo, fechaVencimiento);
        this.tipo = tipo;
    }
}

