package com.mera.traning.lection3;

interface RadioControl {
    void pressOnButton();
    void pressOffButton();
}

class TV implements RadioControl {
    @Override
    public void pressOnButton() { System.out.println("Включили телевизор"); }

    @Override
    public void pressOffButton() { System.out.println("Выключили телевизор"); }
}


public class Test {
    protected int x = 11;
}

class Main {

    public static void main(String[] args) {
        final Test test = new Test();
        test.x = 42;
    }
}

