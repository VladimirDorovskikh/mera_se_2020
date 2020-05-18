package abstractSuprematism;

public class Circle extends Figure {
    private double radius = 0;

    public Circle(int x, int y, int radius) throws IllegalArgumentException {
        super(x, y);
        if (radius < 0) {
            throw new IllegalArgumentException("Radius should be grater than 0");
        } else if (radius > 10) {
            throw new IllegalArgumentException("Radius should be less than 10");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String getClassName() {
        return "Circle";
    }

    @Override
    double getSquare() {
        return Math.PI * getRadius() * getRadius();
    }
}
