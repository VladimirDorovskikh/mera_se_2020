package com.mera.kalinina.lesson4;

public abstract class Fruit {

    protected int weight; // in grams

    public Fruit(int weight) {
        this.weight = weight;
    }

    public abstract String toString();

}
