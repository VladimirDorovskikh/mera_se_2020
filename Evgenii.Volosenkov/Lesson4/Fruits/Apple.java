package Fruits;

public class Apple extends Fruit{

    private String color;
    public Apple(int weight, String color)
    {
        super("Яблоко", weight);
        this.color = color;
    }

    public String toString()
    {
        return super.toString() + ", цвет:" + color;
    }
}
