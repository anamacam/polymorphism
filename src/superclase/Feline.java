package superclase;

public class Feline extends Animal{

    protected boolean esDomestico;

    public Feline(int edad, String tamaño, int peso, String habita, String color, boolean esDomestico) {
        super(edad, tamaño, peso, habita, color);
        this.esDomestico = esDomestico;
    }


    public void comer() {

        System.out.println(" Soy un felino y estoy comiendo");
    }

    public void comunicarse() {

        System.out.println(" Soy un felino y estoy comunicando");
    }
    public void moverse() {

        System.out.println(" Soy un felino y estoy moviendo");
    }


}

