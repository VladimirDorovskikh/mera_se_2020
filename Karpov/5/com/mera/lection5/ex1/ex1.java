package com.mera.lection5.ex1;

import java.util.Random;

class Ex1 {
    public static void main(String[] args){
        Random coin = new Random();
        Figure[] figureSet = new Figure [5];
        for (int i = 0; i<figureSet.length; i++ ) {
            switch (coin.nextInt(2)) {
                case 0:
                    figureSet[i] = new Circle(0+i, 3-i, 3-i);
                    break;
                default:
                    figureSet[i] = new Rectangle(0+i, 3-i, 3-i, i);
            }
        }
        for (Figure figure : figureSet){
            System.out.println(figure);
        }

    }

}
