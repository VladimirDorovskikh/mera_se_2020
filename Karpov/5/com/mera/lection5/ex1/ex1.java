package com.mera.lection5.ex1;

import java.util.Random;

/* the exeption is expected to demostrate exeptions work */

class Ex1 {
    public static void main(String[] args){
        Random coin = new Random();

        Figure[] figureSet = new Figure [5];
        for (int i = 0; i<figureSet.length; i++ ) {
            if (coin.nextInt(2)==0) {
                figureSet[i] = new Circle(i, -2 - i, 2 - i);
            }
            else {
                figureSet[i] = new Rectangle(-2+i, 3-i, 3-i, i);
            }
            getFigureInfo(figureSet[i]);
        }
    }

    private static void getFigureInfo(Figure figure){
        System.out.println(figure);
        System.out.printf("x: %d, y: %d\n", figure.x, figure.y);
        System.out.println(figure.getQuadrant());
    }

}
