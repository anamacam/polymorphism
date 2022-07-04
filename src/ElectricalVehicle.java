import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;
    public ElectricalVehicle() {

    }
    public ElectricalVehicle(Integer potency) {
        this.potency = potency;

    }

    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;

    }

    public Integer getPotencia() {

        return potency;
    }

    public void setPotencia(Integer potencia) {

        this.potency = potencia;
    }

    @Override
    public String technicalSheet() {
        String technicalSheet = toString() + "Es un Auto de ultima tecnología";
        if (year < 2007) {
            technicalSheet = "Es un auto de última tecnología";
        }

        return technicalSheet;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ElectricalVehicle)) return false;
        if (!super.equals(o)) return false;
        ElectricalVehicle that = (ElectricalVehicle) o;
        return Objects.equals(potency, that.potency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), potency);
    }

    @Override
    public String toString() {
        return "ElectricalVehicle{" +
                "potency=" + potency +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}





