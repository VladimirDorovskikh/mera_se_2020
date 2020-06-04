import java.util.Objects;

public class Bycicle {
    String model;
    int maxSpeed;

    public Bycicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bycicle bycicle = (Bycicle) o;
        return maxSpeed == bycicle.maxSpeed &&
                Objects.equals(model, bycicle.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed);
    }
}
