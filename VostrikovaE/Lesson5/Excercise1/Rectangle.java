package VostrikovaE.Lesson5.Excercise1;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public void setLength(double length) {
        if (length > 0 & length <=20 ) {
            this.length = length;
        } else {
            throw new IllegalArgumentException("bad length parameter. must be from 0 to 20");
        }
    }
    public void setWidth(double width) {
        if (width > 0 & width <=20 ) {
            this.width = width;
        } else {
            throw new IllegalArgumentException("bad width parameter. must be from 0 to 20");
        }
    }

    public Rectangle(double length, double width, double middleX, double middleY) {
        this.setLength(length);
        this.setWidth(width);
        this.setMiddleX(middleX);
        this.setMiddleY(middleY);
    }

    @Override
    public double square() {
        return (length*width/2);
    }

    @Override
    public String getFigureName() {
        return "Rectangle";
    }
}
