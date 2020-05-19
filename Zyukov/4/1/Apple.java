import java.util.Random;

public class Apple extends Fruit {
    private String allColors[] = {"RED", "GREEN", "YELLOW"};
    private String color;

    public Apple() {
        this.color = allColors[new Random().nextInt(allColors.length)];
    }

    @Override
    public String toString() {
        return String.format("Fruit [weight=%d, color=%s, type=Apple]", this.weight, this.color);
    }
}
