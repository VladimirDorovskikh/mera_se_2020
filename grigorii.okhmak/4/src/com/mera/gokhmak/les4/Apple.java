package com.mera.gokhmak.les4;

public class Apple extends Fruit {
    private String color;

    public Apple(int weight, String color) {
        super(weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Apple {" +
                "weight='" + getWeight() + '\'' +
                " color='" + color + '\'' +
                '}';
    }
}
