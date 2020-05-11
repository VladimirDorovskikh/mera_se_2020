package com.mera.traning.lection3;

public class PointMain {
    public static void main(String[] args) {
        Point randomPoint = Point.makeSomePoint();
        System.out.println("Random point");
        randomPoint.print();

        Point point1 = new Point(0,0);
        Point point2 = new Point();


        Point point3 = point1;
        point1.x = 42;

        point1.print();
        point1.print("y");

        point2.print();

        Point.setDefaultValues(42, 1);

        point3 = new Point();
        point3.print();


    }
}
