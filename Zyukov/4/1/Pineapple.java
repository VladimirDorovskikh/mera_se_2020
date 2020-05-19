import java.util.Random;

public class Pineapple extends Fruit {
    private int tailHeight;

    public Pineapple() {
        tailHeight = new Random().nextInt(16) + 5;
    }

    @Override
    public String toString() {
        return String.format("Fruit [weight=%d, tailHeight=%d, type=Pineallple]", this.weight, this.tailHeight);
    }
}
