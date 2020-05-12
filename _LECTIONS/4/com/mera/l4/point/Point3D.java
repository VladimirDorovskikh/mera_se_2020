package com.mera.l4.point;

public class Point3D extends Point
{
    int z;


    public Point3D() {
        super(0,0);
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        System.out.println("Это трехмерный конструктор");
    }

    @Override
    public int sum() {
        return super.sum() + z;
    }

    public void print3D() {
        System.out.println("Я трехмерная точка!");
    }
}
