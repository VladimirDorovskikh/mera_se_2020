package com.mera.training.task05;

class Circle extends Figure {
    private int radius = super.getFromInterval(0, 10); // From 0 to 10

    public Circle() {
        super();

        // Set cartesian coordinates of the circle center
        super.x = super.getFromInterval(-10, 30);
        super.y = super.getFromInterval(-30, 40);
    }

    public double square(){
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
