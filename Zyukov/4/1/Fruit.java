import java.util.Random;

abstract public class Fruit {
    protected int weight;

    protected Fruit() {
        weight = new Random().nextInt(50) + 1;
    }

    @Override
    public String toString() {
        return String.format("Fruit[weight=%d]", this.weight);
    }
}
