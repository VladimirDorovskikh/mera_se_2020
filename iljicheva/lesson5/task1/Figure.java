package iljicheva.lesson5.task1;

public abstract class Figure {
    public enum Quadrant {
        I("Quadrant I"),
        II("Quadrant I"),
        III("Quadrant I"),
        IV("Quadrant I"),
        O("Dot does not belong to any quadrant");

        private final String quadrant;

        Quadrant(String quadrant){
            this.quadrant = quadrant;
        }
    }

    int x;
    int y;

    public Figure() {
        this.x = 0;
        this.y = 0;
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    abstract double calculateSquare();

    public Quadrant getQuadrant(){
        if (x > 0 && y > 0) {
            return Quadrant.I;
        }
        else if (x < 0 && y > 0) {
            return Quadrant.II;
        }
        else if (x < 0 && y < 0) {
            return Quadrant.III;
        }
        else if (x > 0 && y < 0) {
            return Quadrant.IV;
        }
        else {
            return Quadrant.O;
        }
    }
}
