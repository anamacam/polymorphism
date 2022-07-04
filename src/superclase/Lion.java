package superclase;

public class Lion extends Feline{

    public Lion(int edad, String tamaño, int peso, String habita, String color, boolean esDomestico) {
        super(edad, tamaño, peso, habita, color, esDomestico);
    }


    @Override
    public void comer() {
        System.out.println("Estoy comiendo zebra");
    }

    @Override
    public void comunicarse() {
        System.out.println("Grrrrrr");
    }

    @Override
    public void moverse() {
        System.out.println("Soy un leon y estoy corriendo");
    }
}
