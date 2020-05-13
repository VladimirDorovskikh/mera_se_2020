package com.mera.gokhmak.les4;

public class Orange extends Fruit {
    private int thinOfPeel;

    public Orange(int weight, int thinOfPeel) {
        super(weight);
        this.thinOfPeel = thinOfPeel;
    }

    @Override
    public String toString() {
        return "Orange {" +
                "weight='" + getWeight() + '\'' +
                " thinOfPeel='" + thinOfPeel + '\'' +
                '}';
    }
}
