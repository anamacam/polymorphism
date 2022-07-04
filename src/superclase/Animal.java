package superclase;

import java.util.Objects;

public class Animal {

    protected int edad;
    protected String tamaño;
    protected int peso;
    protected String habita;
    protected String color;


    public Animal(int edad, String tamaño, int peso, String habita, String color) {
        this.edad = edad;
        this.tamaño = tamaño;
        this.peso = peso;
        this.habita = habita;
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return getEdad() == animal.getEdad() && Objects.equals(tamaño, animal.tamaño) && Objects.equals(peso, animal.peso) && Objects.equals(habita, animal.habita) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEdad(), tamaño, peso, habita, color);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "edad=" + edad +
                ", tamaño='" + tamaño + '\'' +
                ", raza='" + peso + '\'' +
                ", habita='" + habita + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public void comer() {
        System.out.println(" soy un gato gatoooooo");
    }

    public void comunicarse() {
    }

    public void moverse() {
    }
}








