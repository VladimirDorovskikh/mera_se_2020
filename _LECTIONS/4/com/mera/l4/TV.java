package com.mera.l4;

public class TV {
    protected boolean isTurnedOn = false;

    public void turnOn() {
        System.out.println("Включаюсь");
        isTurnedOn = true;
    }

    public void turnOff() {
        System.out.println("Выключаюсь");
        isTurnedOn = false;
    }



    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
