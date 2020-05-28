package Fruits;

public class Orange extends Fruit{
    private int skinThikness;
    public Orange(int weight, int skinThikness)
    {
        super("Апельсин", weight);
        this.skinThikness = skinThikness;
    }
    public String toString()
    {
        return super.toString() + ", толщина кожуры:" + skinThikness;
    }
}
