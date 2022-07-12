package interfaces;

public class Animal implements LivingBeing {

    public String type;

    public String habitat;

    @Override
    public void eat(String foodName) {
        System.out.println("Hola soy un animal y estoy comiendo " + foodName);

    }

    @Override
    public void sleep() {
        System.out.println("Hola soy un animal y estoy durmiendo");

    }

    @Override
    public void communicate() {
        System.out.println("Hola soy un animal y estoy comunicando");

    }
}
