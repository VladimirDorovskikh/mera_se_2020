package iljicheva.lesson4.task1;

import java.util.Random;

public class Orange extends Fruit {

    private int skinThickness;

    public Orange() {
        super();
        this.skinThickness = new Random().nextInt(20);
    }

    public Orange(int skinThickness) {
        this.skinThickness = skinThickness;
    }

    public int getSkinThickness() {
        return skinThickness;
    }

    @Override
    public String toString() {
        return "Fruit: " + this.getClass().getSimpleName() +
                "\nЕhickness of skin: " + this.getSkinThickness() +
                "\nWeight: " + this.weight;
    }
}
