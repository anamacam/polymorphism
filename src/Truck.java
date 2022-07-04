import java.util.Objects;

public class Truck extends Vehicle {
    private Integer maxLoad;

    public Truck() {

    }

    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Truck(String bread, String model, Integer year, Integer maxLoad) {
        super(bread, model, year);
        this.maxLoad = maxLoad;

    }
    @Override
    public String technicalSheet() {
        String technicalSheet = toString();
        if (maxLoad < 100){
            technicalSheet = technicalSheet + " Para iniciar un negocio de flete, este vehículo esta bien";
        } else {
        technicalSheet = technicalSheet + " Tienes que usar este auto en trabajo de campo";
    }
        return technicalSheet;

    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
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
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}

