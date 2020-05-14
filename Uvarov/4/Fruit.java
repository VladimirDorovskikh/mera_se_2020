package mera;

public class Fruit {
    protected int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public Fruit() {
        this(0);
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Fruit:" + " weight=" + getWeight();
    }
}
