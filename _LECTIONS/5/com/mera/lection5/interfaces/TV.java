package com.mera.lection5.interfaces;

public class TV extends Object implements RadioControllable {
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
}
