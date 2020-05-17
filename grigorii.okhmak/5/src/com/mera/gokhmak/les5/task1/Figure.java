package com.mera.gokhmak.les5.task1;

public abstract class Figure {
    public enum Quadrant {
        I, II, III, IV
    }

    public Figure(Point figureCenter) {
        this.figureCenter = figureCenter;
    }

    private Point figureCenter;

    public abstract Number square();
    public Quadrant getQuadrant() {
        Quadrant result = null;

        if (figureCenter.getX() < 0.) {
            result = figureCenter.getY() < 0. ? Quadrant.III : Quadrant.II;
        } else {
            result = figureCenter.getY() < 0. ? Quadrant.IV : Quadrant.I;
        }

        return result;
    }
}
