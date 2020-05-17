package com.mera.training.task05;

public class Task0501 {

    public static void main(String[] args) {
        try {
            final int FIGURE_COUNT = 5;
            Figure[] figures = new Figure[FIGURE_COUNT];

            figures[0] = new Rectangle();
            figures[1] = new Circle();
            figures[2] = new Rectangle();
            figures[3] = new Circle();
            figures[4] = new Rectangle();

            for (Figure figureItem : figures) {
                System.out.println("Figure name: " + figureItem.toString() + " - square: " + figureItem.square() +
                        " - center x: " + figureItem.getX() + ", y: " + figureItem.getY() +
                        " - quadrant: " + figureItem.getQuadrant(figureItem.getX(), figureItem.getY()));
            }
        }
        catch(Exception e) {
            // Prints line numbers + call stack
            e.printStackTrace();

            // Prints what exception has been thrown
            System.err.println();
        }
    }
}
