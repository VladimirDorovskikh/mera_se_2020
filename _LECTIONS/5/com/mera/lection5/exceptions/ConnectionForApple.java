package com.mera.lection5.exceptions;

public class ConnectionForApple {


    public ConnectionForApple() {
        System.out.println("Соединение открыто");
    }

    public String getAppleColor() {
        return Apple.ЖЕЛТЫЙ;
    }

    public int getWeight() {
        return -4;
    }

    public void close() {
        System.out.println("Соединнеие закрыто");
    }
}
