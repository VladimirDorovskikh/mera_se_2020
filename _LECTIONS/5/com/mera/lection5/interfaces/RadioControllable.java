package com.mera.lection5.interfaces;

public interface RadioControllable {
    void turnOff();
    void turnOn();

    boolean isEnabled();


    interface WiFiControllable extends RadioControllable {
        public boolean checkInternetConnection();
    }

}


