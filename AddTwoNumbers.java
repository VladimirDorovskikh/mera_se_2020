package com.company.AddTwoNumbers;

import java.util.Scanner;

class AddTwoNumbers {

    public static void main(String[] args) {
        // Ввести два числа с клавиатуры
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        Integer num1 =scn.nextInt();

        System.out.println("Введите второе число: ");
        Integer num2 =scn.nextInt();

        scn.close();

        // Сравнить 2 числа
        if (num1.compareTo(num2) > 0) {
            System.out.println("\"" + "Число " +num1 + " больше " + num2 + "\"");
        }
        else if (num1.compareTo(num2) < 0) {
            System.out.println("\"" + "Число " +num1 + " меньше " + num2 + "\"");
        }

        // Вывести на экран сумму этих чисел
        System.out.printf("\"Сумма чисел %d и %d равна %d\"", num1, num2, num1 + num2);
    }
}
