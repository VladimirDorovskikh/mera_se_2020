package Fruits;

public class Fruit {
    protected int weight;
    protected String name;
    public Fruit(String name, int weight)
    {
        this.weight = weight;
        this.name = name;
    }
    public String toString()
    {
        return String.format("%s -> вес: %d", name, weight);
    }
}
