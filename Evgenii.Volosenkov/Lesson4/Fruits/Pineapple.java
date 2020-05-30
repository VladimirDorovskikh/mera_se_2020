package Fruits;

public class Pineapple extends Fruit{
    private int tailHeight;
    public Pineapple(int weight, int tailHeight)
    {
        super("Ананас", weight);
        this.tailHeight = tailHeight;
    }
    public String toString()
    {
        return super.toString() + ", высота хвоста:" + tailHeight;
    }
}
