package superclase;

public class Gato extends Feline {

    public Gato(int edad, String tamaño, int peso, String habita, String color, boolean esDomestico) {
        super(edad, tamaño, peso, habita, color, esDomestico);
    }

    @Override
    public void comer() {

    }

    @Override
    public void comunicarse() {
        System.out.println("Miau");
    }

    @Override
    public void moverse() {
        System.out.println("Soy un gato y me estoy moviendo");
    }
}


