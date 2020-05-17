package com.mera.gokhmak.les5.task1;

public class Task1 {
    public static void main(String[] args) {
        Figure[] figures =
                {
                  new Circle(new Point(1, 2), 12.5),
                  new Rectangle(new Point(-12.5, 34.8), 12, 13),
                  new Circle(new Point(-3, -15.8), 50),
                  new Rectangle(new Point(25.6, -12.5), 100, 300),
                  new Rectangle(new Point(-40.65, -36.544), 12.5, 38.9)
                };
        for (Figure figure : figures) {
            System.out.println(figure);
        }
    }
}
