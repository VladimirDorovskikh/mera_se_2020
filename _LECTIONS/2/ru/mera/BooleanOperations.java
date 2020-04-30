package ru.mera;

import java.util.Random;

public class BooleanOperations {

    public static void main(String[] args) {
        boolean itsTrue = true;
        boolean itsFalse = false;


        System.out.println("true ^ true:");
        System.out.println( itsTrue ^ itsTrue);
        System.out.println();

        System.out.println("false ^ false:");
        System.out.println( itsFalse ^ itsFalse);
        System.out.println();

        System.out.println("false ^ true:");
        System.out.println( itsFalse ^ itsTrue);
        System.out.println();


        System.out.println("!false:");
        System.out.println(!itsFalse);
/*
        int a = new Random().nextInt();

        if (a < 0) {
            System.out.println("a отрицательное");
        } else if (a < 10) {
            System.out.println("a меньше десяти");
        }else {
            System.out.println("a больше 10");
        }*/
    }

}
