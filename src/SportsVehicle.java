import java.util.Objects;

public class SportsVehicle extends Vehicle{
    private Integer rpm;

    public SportsVehicle() {
    }
    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;
    }

    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    @Override
    public String technicalSheet() {
        String technicalSheet = toString();
        if (rpm >= 0 && rpm <= 50){
            technicalSheet = technicalSheet + "El auto es muy bonito, pero solo sirve para salir a pasear ";
        }else if (rpm >= 51 && rpm <= 300) {
           technicalSheet = technicalSheet + "Con este auto puedes desafiar a cualquiera en la pista";
        }else if (rpm >= 301 && rpm <= 600) {
           technicalSheet = technicalSheet + "si tienes este auto, debe considerar participar en NASCAR";
        }else  if (rpm < 600) {
           technicalSheet = technicalSheet + "¿Eres parte del elenco de rápidos y furiosos?";
    }
        return technicalSheet; }
    @Override
    public boolean equals(Object o) {
        if (this== o) return true;
        if (!(o instanceof SportsVehicle)) return false;
        if (!super.equals(o)) return false;
        SportsVehicle that = (SportsVehicle) o;
        return getRpm().equals(that.getRpm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRpm());
    }

    @Override
    public String toString() {
        return "SportsVehicle{" +
                "rpm=" + rpm +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}