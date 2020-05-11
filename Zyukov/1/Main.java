package com.company;

public class Main {

    public static void main(String[] args) {

        Integer i = new Integer(0);
        Integer j = new Integer(0);

        if (args.length < 2) {
            System.out.println("Wrong number of the arguments");
            return;
        }

        try {
            i = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong argument " + args[1] + ": " + e.getMessage());
        }

        try {
            j = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("Wrong argument " + args[2] + ": " + e.getMessage());
        }

        Integer compare = i.compareTo(j);
        if (compare > 0) {
            System.out.println("The number "+  i + " is greater than " + j);
        } else if (compare < 0){
            System.out.println("The number "+  i + " is less than " + j);
        } else {
            System.out.println("The number "+  i + " is equal to " + j);
        }

        System.out.println("Sum of " + i + " and " + j + " is " + (i+j));
    }
}
