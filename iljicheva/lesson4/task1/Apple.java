package iljicheva.lesson4.task1;

import java.util.Random;

public class Apple extends Fruit {
    private String[] colors = {"RED","GREEN","YELLOW"};
    private String color;

    public Apple() {
        super();
        this.color = colors[new Random().nextInt(3)];
    }

    public Apple(String color) {
        super();
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Fruit: " + this.getClass().getSimpleName() +
                "\nColor: " + this.getColor() +
                "\nWeight: " + this.weight;
    }
}