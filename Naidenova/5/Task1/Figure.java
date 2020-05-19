import java.util.Random;

public abstract class Figure {
    protected int x;
    protected int y;

    public Figure(int x, int y){
        this.x = x;
        this.y = y;
    }

    public abstract double square();

    enum Quadrant{I, II, III, IV}

    public static Quadrant getQuadrant(int x,int y) {
        Quadrant quadrant;
        if (x>0 & y>0) {
            quadrant = Quadrant.I;
        }
        else if (x<0 & y>0) {
            quadrant =  Quadrant.II;
        }else if (x<0 & y<0) {
            quadrant = Quadrant.III;
        }else {
            quadrant = Quadrant.IV;
        }
        return quadrant;
    }

}

class Circle extends Figure{
    public int radius;

    public Circle(int x, int y, int radius) {
        super(x,y);
        this.radius = radius;
    }

    public double square(){
        return 2*3.14*radius;
    }

    public String toString(){
        return "Circle - " + square();
    }
}

class Rectangle extends Figure{
    public int width;
    public int height;

    public Rectangle(int x, int y, int width, int height){
        super(x,y);
        this.width = width;
        this.height = height;
    }

    public double square(){
        return width*height;
    }

    public String toString(){
        return "Rectangle - " + square();
    }
}
