import java.util.Random;

public class Circle extends Figure {
    private int radius;

    public Circle() {
        radius = new Random().nextInt(11);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, 2);
    }
}