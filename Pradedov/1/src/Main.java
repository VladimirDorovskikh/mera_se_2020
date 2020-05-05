/*
Написать программу, в которой есть две переменные типа Integer со значениями. Значения можно указать в коде программы,
или ввести с клавиатуры, или взять из аргументов.
Если первое число больше второго – написать на экран « Число %s больше %s”
Если первое число меньше второго – написать на экран «Число %s меньше %s”
В любом случае, вывести на экран сумму чисел.
 */

import java.util.Scanner;

class CompareTwoIntegers {
    private static final int DEFAULT_VALUE_A = 5;
    private static final int DEFAULT_VALUE_B = 10;

    private int value_a = DEFAULT_VALUE_A;
    private int value_b = DEFAULT_VALUE_B;
    private String [] args;
    private boolean valuesWereSet = false;

    public CompareTwoIntegers(String [] args) {
        this.args = args;
    }

    private void ReadValuesFromArgs() {
        try {
            value_a = Integer.parseInt(args[0]);
            value_b = Integer.parseInt(args[1]);
            System.out.println("Values provided via args: value_a = " + value_a + " value_b = " + value_b);
            valuesWereSet = true;
        }
        catch (NumberFormatException ex) {
            System.out.println("Wrong command line arguments. Two integer values are only expected.");
        }
    }

    private void ReadValuesFromInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Type two space-separated integer numbers and press enter");
        try {
            // prevent values update in case of exception
            value_a = input.nextInt();
            value_b = input.nextInt();
            valuesWereSet = false;
        }
        catch (IllegalStateException ex) {
            System.out.println("Cannot read data from input.");
        }
        catch (Exception ex) {
            System.out.println("Wrong input was provided. Only two space-separated integer values are expected");
        }
    }

    public void CompareAndSum() {
        if (null != args && 2 == args.length) {
            ReadValuesFromArgs();
        }

        if (!valuesWereSet) {
            ReadValuesFromInput();
        }

        if (!valuesWereSet) {
            System.out.println("Neither arguments nor prompt values were correct. "
                    + "Use default values: value_a = " + value_a + ", value_b = " + value_b);
        }

        if (value_a > value_b) {
            System.out.println("\nNumber " + value_a + " is greater than " + value_b);
        }
        else if (value_b > value_a) {
            System.out.println("\nNumber " + value_b + " is greater than " + value_a);
        }
        else {
            System.out.println("\nNumbers are equal: " + value_a);
        }
        System.out.println("Sum is: " + (value_a + value_b));
    }
}

public class Main {
    public static void main(String[] args) {
        CompareTwoIntegers compare = new CompareTwoIntegers(args);
        compare.CompareAndSum();
    }
}