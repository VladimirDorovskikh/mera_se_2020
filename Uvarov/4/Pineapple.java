package mera;

import java.util.Random;

public class Pineapple extends Fruit {
    private static final int MAX_TAIL_HEIGHT = 20;
    private static final int MIN_TAIL_HEIGHT = 5;
    private int tailHeight;

    public Pineapple(int weight, int tailHeight) {
        super(weight);
        this.tailHeight = tailHeight;
    }

    public static Pineapple getRandomFruit() {
        Random rnd = new Random();
        int weight = rnd.nextInt(100);
        int tailHeight = rnd.nextInt(MAX_TAIL_HEIGHT-MIN_TAIL_HEIGHT)+MIN_TAIL_HEIGHT;
        return new Pineapple(weight, tailHeight);
    }

    public int getTailHeight() {
        return tailHeight;
    }

    public void setTailHeight(int tailHeight) {
        this.tailHeight = tailHeight;
    }

    @Override
    public String toString() {
        return "Pineapple:" + " weight=" + getWeight() + " tailHeight=" + getTailHeight();
    }
}
