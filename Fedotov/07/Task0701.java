package com.mera.training.task07;

public class Task0701 {
    public static void main(String[] args) {

        try {
            Zoo zoo = new Zoo();
            zoo.printAllAnimals();
        }
        catch (Exception e) {
            // Prints line numbers + call stack
            e.printStackTrace();

            // Prints what exception has been thrown
            System.err.println();
        }

    }
}
