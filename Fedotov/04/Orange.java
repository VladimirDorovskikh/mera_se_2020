package com.mera.training.task04;

public class Orange extends Fruit {
    private int skinThickness = super.getFromInterval(0, 20); // From 0 to 20

    public Orange() {
        super();
    }

    public int getSkinThickness() {
        return this.skinThickness;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Skin Thickness: " + getSkinThickness() + ", Weight: " + super.getWeight();
    }
}
