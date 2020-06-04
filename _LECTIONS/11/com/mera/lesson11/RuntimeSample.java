package com.mera.lesson11;

import java.io.IOException;

public class RuntimeSample {

    public static void main(String[] args) throws Exception {
        final Process exec = Runtime.getRuntime().exec("notepad.exe");
        Thread.sleep(2000);
        //exec.destroyForcibly();


    }
}
