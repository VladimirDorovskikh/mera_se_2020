package figures;

public class Rectangle extends Figure
{
    double width, height;
    public Rectangle(double x, double y, double width, double height)
    {
        super(x, y, "прямоугольник");
        if(width<0.0)
        {
            throw new NonPositiveRectangleParameters("Incorrect width: " + width);
        }
        if(height<0.0)
        {
            throw new NonPositiveRectangleParameters("Incorrect height: " + height);
        }
        this.width = width;
        this.height = height;
    }

    @Override
    public double square() {
        return width*height;
    }
}
