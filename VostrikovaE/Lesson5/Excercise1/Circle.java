package VostrikovaE.Lesson5.Excercise1;

public class Circle extends Figure{
    private double radius;

    public void setRadius(double radius) {
        if (radius > 0 & radius <= 10) {
            this.radius = radius;
        } else {
            throw new IllegalArgumentException("bad radius parameter. must be from 0 to 10");
        }
    }

    public Circle(double radius, double middleX, double middleY) {
        this.setRadius(radius);
        this.setMiddleX(middleX);
        this.setMiddleY(middleY);
    }

    @Override
    public double square() {
        return (radius*radius*Math.PI);
    }

    @Override
    public String getFigureName() {
        return "Circle";
    }
}
