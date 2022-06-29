import java.util.Objects;

public class Truck extends Vehicle {
    private Integer maxLoad;

    public Truck(String bread, String model, Integer year, Integer maxLoad) {
        super(bread, model, year);
        this.maxLoad = maxLoad;
    }

    public Truck(String volvo, String fh, int year) {

    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public String technicalSheet() {
        String text = new String();

        if (maxLoad > 100) {
            String tex;
            tex = "Para iniciar un negocio de flete, está muy bien este auto";
        }
        return ("La marca es: " + getBrand() + "El Modelo es: " + getModel() + "el año" + getYear() + text);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Truck)) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return getMaxLoad().equals(truck.getMaxLoad());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getMaxLoad());
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxLoad=" + maxLoad +
                '}';
    }
}