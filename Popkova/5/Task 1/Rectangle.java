import java.util.Random;

public class Rectangle extends Figure {
    private int height;
    private int width;

    public Rectangle() {
        height = new Random().nextInt(21);
        width = new Random().nextInt(21);
    }

    @Override
    public double square() {
        return height * width;
    }
}
