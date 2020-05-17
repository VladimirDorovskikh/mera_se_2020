package com.mera.gokhmak.les5.task1;

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures =
                {
                  new Circle(new Point(1, 2), 10.),
                  new Rectangle(new Point(-12.5, 34.8), 10., 9.9),
                  new Circle(new Point(-3, -15.8), 5.5),
                  new Rectangle(new Point(25.6, -12.5), 1.5, 3.6),
                  new Rectangle(new Point(-40.65, -36.544), 4.2, 10.)
                };
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
