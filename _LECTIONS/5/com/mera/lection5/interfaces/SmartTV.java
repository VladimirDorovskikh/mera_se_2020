package com.mera.lection5.interfaces;

import com.mera.lection5.interfaces.RadioControllable.WiFiControllable;

public class SmartTV extends TV implements WiFiControllable {


    public final static String CLASS_NAME = "УМНЫЙ ТЕЛЕВИЗОР!";
    public final static String CLASS_TYPE = "ТЕЛЕВИЗОРы";

    boolean isInternetAvailable = false;

    @Override
    public boolean checkInternetConnection() {
        return isInternetAvailable;
    }
}
