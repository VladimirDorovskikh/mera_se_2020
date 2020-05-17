import java.util.Random;

public class Pineapple extends Fruit {
    private int tailHeight;

    public Pineapple() {
        tailHeight = new Random().nextInt(51) + 10;
    }

    @Override
    public String toString() {
        return String.format("Fruit [weight=%d, tailHeight=%d, type=Pineallple]", this.weight, this.tailHeight);
    }
}
