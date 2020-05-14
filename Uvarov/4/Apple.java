package mera;

import java.util.Random;

public class Apple extends Fruit {
    private String color;

    public Apple(int weight, String color) {
        super(weight);
        this.color = color;
    }

    public Apple() {
    }

    public static Apple getRandomFruit() {
        Random rnd = new Random();
        String[] colors = new String[]{"green", "yellow", "red"};
        int weight = rnd.nextInt(100);
        int colorNumber = rnd.nextInt(colors.length);
        return new Apple(weight, colors[colorNumber]);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple:" + " weight=" + getWeight() + " color=" + getColor();
    }
}
