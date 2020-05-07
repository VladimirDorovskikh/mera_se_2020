/*
Написать программу, в которой есть две переменные типа Integer со значениями. Значения можно указать в коде программы,
или ввести с клавиатуры, или взять из аргументов.
Если первое число больше второго – написать на экран « Число %s больше %s”
Если первое число меньше второго – написать на экран «Число %s меньше %s”
В любом случае, вывести на экран сумму чисел.
 */

import java.util.Scanner;

class compareTwoIntegers {
    private static final int DEFAULT_VALUE_A = 5;
    private static final int DEFAULT_VALUE_B = 10;

    private int valueA = DEFAULT_VALUE_A;
    private int valueB = DEFAULT_VALUE_B;
    private String [] args;
    private boolean valuesWereSet = false;

    public compareTwoIntegers(String [] args) {
        this.args = args;
    }

    private void readValuesFromArgs() {
        try {
            valueA = Integer.parseInt(args[0]);
            valueB = Integer.parseInt(args[1]);
            System.out.println("Values provided via args: value_a = " + valueA + " value_b = " + valueB);
            valuesWereSet = true;
        }
        catch (NumberFormatException ex) {
            System.out.println("Wrong command line arguments. Two integer values are only expected.");
        }
    }

    private void readValuesFromInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type two space-separated integer numbers and press enter");
        try {
            // prevent values update in case of exception
            valueA = input.nextInt();
            valueB = input.nextInt();
            valuesWereSet = true;
        }
        catch (IllegalStateException ex) {
            System.out.println("Cannot read data from input.");
        }
        catch (Exception ex) {
            System.out.println("Wrong input was provided. Only two space-separated integer values are expected");
        }
    }

    public void compareAndSum() {
        if (null != args && 2 == args.length) {
            readValuesFromArgs();
        }

        if (!valuesWereSet) {
            readValuesFromInput();
        }

        if (!valuesWereSet) {
            System.out.println("Neither arguments nor prompt values were correct. "
                    + "Use default values: value_a = " + valueA + ", value_b = " + valueB);
        }

        if (valueA > valueB) {
            System.out.println("\nNumber " + valueA + " is greater than " + valueB);
        }
        else if (valueB > valueA) {
            System.out.println("\nNumber " + valueB + " is greater than " + valueA);
        }
        else {
            System.out.println("\nNumbers are equal: " + valueA);
        }
        System.out.println("Sum is: " + (valueA + valueB));
    }
}

public class Main {
    public static void main(String[] args) {
        compareTwoIntegers compare = new compareTwoIntegers(args);
        compare.compareAndSum();
    }
}