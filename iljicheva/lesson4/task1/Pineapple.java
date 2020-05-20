package iljicheva.lesson4.task1;

import java.util.Random;

public class Pineapple extends Fruit {
    private int tailLength;

    public Pineapple() {
        super();
        this.tailLength = new Random().nextInt(15) + 5;
    }

    public Pineapple(int tailLength) {
        super();
        this.tailLength = tailLength;
    }

    public int getTailLength() {
        return tailLength;
    }

    @Override
    public String toString() {
        return "Fruit: " + this.getClass().getSimpleName() +
                "\nLength of tail: " + this.getTailLength() +
                "\nWeight: " + this.weight;
    }
}
