package com.mera.gokhmak;

public class Fruit {
    static final String[] COLORS = {"yellow","green","red"};

    private int weight;

    public Fruit(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    static public Fruit getRandomFruit() {
        // 0 - Apple, 1 - Orange, 2 - Pineapple
        int whatFruit = Randomizer.getRandomInRange(0, 2);
        Fruit result = null;
        int[] randomValues;
        switch (whatFruit) {
            case 0:
                randomValues = Randomizer.getRandomSequence(2,1, 50, 0, COLORS.length - 1);
                result = new Apple(randomValues[0], COLORS[randomValues[1]]);
                break;
            case 1:
                randomValues = Randomizer.getRandomSequence(2,1, 50, 0, 20);
                result = new Orange(randomValues[0], randomValues[1]);
                break;
            case 2:
                randomValues = Randomizer.getRandomSequence(2, 1, 50, 5, 20);
                result = new Pineapple(randomValues[0], randomValues[1]);
                break;
            default:
                break;
        }
        return result;
    }

    @Override
    public String toString() {
        return "Fruit {" +
                " weight='" + weight + '\'' +
                '}';
    }
}
