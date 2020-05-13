package com.mera.gokhmak;

public class Pineapple extends Fruit {
    private int sizeOfStalk;

    public Pineapple(int weight, int sizeOfStalk) {
        super(weight);
        this.sizeOfStalk = sizeOfStalk;
    }

    @Override
    public String toString() {
        return "Pineapple {" +
                "weight='" + getWeight() + '\'' +
                " sizeOfStalk='" + sizeOfStalk + '\'' +
                '}';
    }
}
