package com.mera.lection5.interfaces;

public class Refrigerator implements RadioControllable, Storable {

    Object[] content = new Object[4];
    int index = 0;
    boolean enabled = false;


    @Override
    public void turnOff() {
        enabled = false;
    }

    @Override
    public void turnOn() {
        enabled = true;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }


    @Override
    public void put(Object item) {
        if (index > 3) {
            index = 0;
        }
        content[index++] = item;
    }

    @Override
    public Object[] getAllItems() {
        return content;
    }
}
