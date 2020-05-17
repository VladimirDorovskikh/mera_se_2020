package com.mera.training.task05;

class Rectangle extends Figure {
    private int width = super.getFromInterval(0, 20); // From 0 to 20
    private int height = super.getFromInterval(0, 20); // From 0 to 20

    public Rectangle() {
        super();

        // Set cartesian coordinates of the rectangle center
        super.x = super.getFromInterval(-10, 30);
        super.y = super.getFromInterval(-30, 40);
    }

    public double square(){
        return width * height;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
