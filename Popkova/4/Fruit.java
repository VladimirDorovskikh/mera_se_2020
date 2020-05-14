package com.katepopkova;

public class Fruit {
    protected int weight;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fruit{");

        sb.append("weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}