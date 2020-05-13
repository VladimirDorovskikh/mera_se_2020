package iljicheva.lesson1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            double a = sc.nextDouble();
            System.out.println("Enter second number: ");
            double b = sc.nextDouble();
            if (a > b) {
                System.out.printf("First Number %.2f higher second number %.2f\n", a, b);
            } else if (a < b) {
                System.out.printf("First Number %.2f lower second number %.2f\n", a, b);
            } else {
                System.out.printf("First Number %.2f equals second number %.2f \n", a, b);
            }
            System.out.printf("Sum of numbers = %.2f", a + b);
        } catch (Exception e){
            System.out.println("Input wrong");
        } finally {
            sc.close();
        }
    }
}
