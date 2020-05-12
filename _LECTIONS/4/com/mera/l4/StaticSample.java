package com.mera.l4;

public class StaticSample {


    static void printSOmething() {
        System.out.println("Parent");
    }


    public static void main(String[] args) {
        StaticSample sample = new StaticSampleChild();
        StaticSample.printSOmething();
    }
}

class StaticSampleChild extends StaticSample {

    static void printSOmething() {
        System.out.println("Child");
    }
}
