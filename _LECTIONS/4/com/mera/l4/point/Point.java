package com.mera.l4.point;

public class Point {
    int x;
    int y;

    /*public Point() {
        this(0, 0);
    }*/

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Создается 2д точка");
    }


    public int sum() {
        return x + y;
    }

}
