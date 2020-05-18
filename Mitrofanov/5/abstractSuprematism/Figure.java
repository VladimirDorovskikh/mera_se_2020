package abstractSuprematism;

public abstract class Figure {
    private int x = 0;
    private int y = 0;

    public enum Quadrant {
        I, II, III, IV
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract String getClassName();

    abstract double getSquare();

    public Quadrant getQuadrant() {
        Quadrant result;
        if (this.getX() < 0) {
            result = (this.getY() < 0) ? Quadrant.III : Quadrant.II;
        } else {
            result = (this.getY() < 0) ? Quadrant.IV : Quadrant.I;
        }
        return result;
    }


}
