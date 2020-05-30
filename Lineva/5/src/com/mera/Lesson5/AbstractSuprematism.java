package com.mera.Lesson5;

import java.util.Random;

class AbstractSuprematism {

    private final static int FIGURES_NUMBER = 5;
    private final static int RADUIS_BOUND = 11, WIDTH_HEIGHT_BOUND = 21;

    public static void main(String[] args) {

        Figure[] figures = new Figure[FIGURES_NUMBER];

        for (int i = 0; i < figures.length; i++) {
            int x = new Random().nextInt();
            int y = new Random().nextInt();

            if (i % 2 == 0) {
                int radius = new Random().nextInt(RADUIS_BOUND);
                figures[i] = new Circle(x, y, radius);
            }
            else {
                int width = new Random().nextInt(WIDTH_HEIGHT_BOUND);
                int height = new Random().nextInt(WIDTH_HEIGHT_BOUND);
                figures[i] = new Rectangle(x, y, width, height);
            }
            System.out.println(figures[i].toString());
        }
    }
}