package com.mera.lection5.interfaces;

public class MainInterfaces {
    public static void main(String[] args) {
        RadioControllable[] items = new RadioControllable[3];
        items[0] = new TV();
        items[1] = new TV();
        items[2] = new Refrigerator();

        for (RadioControllable item : items) {
            item.turnOn();
        }

        for (RadioControllable item : items) {
            System.out.println(item.getClass().getSimpleName() + " включен? "  + item.isEnabled());
        }
    }
}
