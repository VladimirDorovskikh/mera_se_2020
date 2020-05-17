import java.util.Random;

public class Orange extends Fruit {
    private int thickness;

    public Orange() {
        thickness = new Random().nextInt(21);
    }

    @Override
    public String toString() {
        return String.format("Fruit [weight=%d, thickness=%d, type=Orange]", this.weight, this.thickness);
    }
}
