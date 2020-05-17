package mera.abstractTask;

public abstract class Figure {
    int x;
    int y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {
        this.x = 0;
        this.y = 0;
    }

    abstract double square();

    Quadrant getQuadrant() {
        if (x > 0 && y > 0) {
            return Quadrant.I;
        } else if (x < 0 && y > 0) {
            return Quadrant.II;
        } else if (x < 0 && y < 0) {
            return Quadrant.III;
        } else
            return Quadrant.VI;
    }
}

