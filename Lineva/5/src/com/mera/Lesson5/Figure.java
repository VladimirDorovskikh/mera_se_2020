package com.mera.Lesson5;

abstract class Figure {

    protected int x, y;

    public Figure(int x, int y) {
        this.x = x;
        this.y = y;
    }

    enum Quadrant {I, II, III, IV}

    abstract double square();

    Quadrant getQuadrant() throws Exception {
        if ((x == 0) || (y == 0)) {
            throw new Exception();
        }

        if (x > 0) {
            return y > 0 ? Quadrant.I : Quadrant.IV;
        }
        return y > 0 ? Quadrant.II : Quadrant.III;
    }

    @Override
    public String toString() {
        String coordinates = new String ("(x = " + x + ", y = " + y + ", ");

        String quadrant = new String();
        try {
            quadrant = getQuadrant().name() + " quadrant)";
        }
        catch (Exception exception) {
            quadrant = "can't determine quadrant because x, y or both are 0)";
        }

        return coordinates + quadrant;
    }
}

