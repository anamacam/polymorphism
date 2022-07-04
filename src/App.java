import superclase.Animal;
import superclase.Feline;
import superclase.Gato;
import superclase.Lion;

public class App {

    public App() {
    }

    public static final void main(String[] args) {
        Animal[] animals = new Animal[4];
        animals[0] = new Animal(4, "Mediano", 120, "Selva", "Negro");
        animals[1] = new Feline(6, "Grande", 50, "Gris", "Gris", false);
        animals[2] = new Lion(10, "Grande", 200, "Selva", "amarillo", false);
        animals[3] = new Gato(8, "Pequeño", 10, "Ciudad", "Cafe", true);

        for (int i = 0; i < animals.length; i++) {
            animals[i].comer();
            animals[i].comunicarse();
            animals[i].moverse();

        }
    }
}







