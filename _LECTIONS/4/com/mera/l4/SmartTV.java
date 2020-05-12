package com.mera.l4;

public class SmartTV extends TV {

    private boolean someVar;

    public void turnOnViaPhone() {
        System.out.println("Включаюсь с телефона");
        isTurnedOn = true;
    }

    public void callFromSuper() {
        super.turnOn();
    }
}


class TVHelper {
    static void checkTVStatus(SmartTV tv) {
        if (!tv.isTurnedOn) {
            System.out.println("Телевизор выключен!Включите");
        }
    }
}