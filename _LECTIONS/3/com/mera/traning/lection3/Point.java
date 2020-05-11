package com.mera.traning.lection3;

import java.util.Random;

public class Point {
    static int DEFAULT_X = -1;
    static int DEFAULT_Y = -1;

    int x;
    int y;


    static {
        System.out.println(String.format("Загружаю класс POINT со значением по умолчанию x=%s, y=%s", DEFAULT_X, DEFAULT_Y));
    }


    {
        System.out.println("Начинаю инициаизировать объект");
    }

    public Point() {
        this(DEFAULT_X, DEFAULT_Y);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("Заканчиваю инициаизировать объект");
    }

    static public Point makeSomePoint() {
        Random r = new Random();
        return new Point(r.nextInt(), r.nextInt());
    }

    static public void setDefaultValues(int x, int y) {
        DEFAULT_X = x;
        DEFAULT_Y = y;
    }

    public int getX() {
        return x;
    }

    public void print() {
        System.out.println(String.format("x=%s, y=%s", x, y));
    }

    public void print(String variableToPrint) {
        if (variableToPrint.equals("x")) {
            System.out.println(String.format("x=%s", x));
        } else if (variableToPrint.equals("y")) {
            System.out.println(String.format(" y=%s", y));
        } else  {
            System.out.println("Неизвестная переменная " + variableToPrint);
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
