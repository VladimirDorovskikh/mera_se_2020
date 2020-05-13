import java.util.Objects;
import java.util.Random;

public class Apple extends Fruit {
    private String color;
    Random random = new Random();

    public Apple(int weight, String color) {
        super(weight);
        if (color.equals("Red") | color.equals("Green") | color.equals("Yellow")) {
            this.color = color;
        } else {
            throw new IllegalArgumentException("Undiscovered color");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "This apple is " + color + " and weights " + getWeight() + "\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Apple apple = (Apple) o;
        return color.equals(apple.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
