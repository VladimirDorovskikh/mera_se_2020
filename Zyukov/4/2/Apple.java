import java.util.Random;

public class Apple extends Fruit {
    private String color;

    public Apple(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Fruit [weight=%d, color=%s, type=Apple]", this.weight, this.color);
    }
}
