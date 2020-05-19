package com.pradedov.task1;

public enum Quadrant {
    I("Quadrant I"),
    II("Quadrant II"),
    III("Quadrant III"),
    IV("Quadrant IV");

    private final String quadrant;

    Quadrant(String quadrant) {
        this.quadrant = quadrant;
    }

    String getQuadrantAsString() {
        return quadrant;
    }
}
