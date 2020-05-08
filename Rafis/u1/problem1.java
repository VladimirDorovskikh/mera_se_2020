/**
 * Написать программу, в которой есть две переменные типа Integer со значениями.
 * Значения можно указать в коде программы или ввести с клавиатуры или взять из аргументов.
 * Если первое число больше второго – написать на экран « Число %s больше %s”
 * Если первое число меньше второго – написать на экран «Число %s меньше %s”
 * В любом случае, вывести на экран сумму чисел.
 */

package Rafis.u1;

public class problem1 {
    public static void main(String[] args){
        if (args.length == 2)
        {
            try
            {
                int arg1 = Integer.valueOf(args[0]);
                int arg2 = Integer.valueOf(args[1]);
                problem1.compare(arg1, arg2);
                System.out.println("Sum of " + arg1 + " and " + arg2 + " is " + (arg1 + arg2));
            }
            catch (NumberFormatException e)
            {
                System.out.println("Incorrect values exception caused by: " + e.getMessage());
            }
        }
        else if (args.length == 0)
        {
            System.out.println("Passing default values.");
            // Default values
            int val1 = 42;
            int val2 = 777;
            problem1.compare(val1, val2);
            System.out.println("Sum of " + val1 + " and " + val2 + " is " + (val1 + val2));
        }
        else
        {
            System.out.println("Incorrect num of args.");
        }
    }
    
    private static void compare(int arg1, int arg2) {
        if (arg1 > arg2)
        {
            System.out.println(arg1 + " > " +  arg2);
        }
        else if (arg1 < arg2)
        {
            System.out.println(arg1 + " < " +  arg2);
        }
        else if (arg1 == arg2)
        {
            System.out.println(arg1 + " == " +  arg2);
        }
    }
}

