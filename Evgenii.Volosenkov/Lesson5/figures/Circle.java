package figures;


public class Circle extends Figure{
    double radius;
    public Circle(double x, double y, double radius)
    {
        super(x, y, "круг");
        if (radius < 0.0)
        {
            throw new NonPositiveRadiusException("Incorrect value of radius: " + radius);
        }
        this.radius = radius;
    }
    @Override
    public double square() {
        return Math.PI*radius*radius;
    }
}
