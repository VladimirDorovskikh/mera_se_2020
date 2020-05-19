import java.util.Random;

public class Circle extends Figure {
    private final static int POWER = 2;

    private int radius;

    public Circle() {

        radius = new Random().nextInt(11);
    }

    @Override
    public double square() {
        return Math.PI * Math.pow(radius, POWER);
    }
}
