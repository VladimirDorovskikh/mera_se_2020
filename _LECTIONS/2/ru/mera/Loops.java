package ru.mera;

public class Loops {

    public static void main(String[] args) {

/*

        System.out.println("Все, кроме 2");
        // напечатаем все числа от 00 до 99, кроме чисел, котоыре заканчиваются на 2
        for (int outerCounter = 0; outerCounter < 10; outerCounter++) {
            for (int innerCounter = 0; innerCounter < 10; innerCounter++) {
                if (innerCounter == 2) {
                    continue;
                }
                System.out.println(outerCounter + "" + innerCounter);
            }
        }
*/


        System.out.println("\nТройки");
        // напечатаем все числа от первые три числа каждого десятка от 0 до 99
        outer_mark:
        for (int outerCounter = 0; outerCounter < 10; outerCounter++) {
            for (int innerCounter = 0; innerCounter < 10; innerCounter++) {
                if (innerCounter > 2) {
                    continue outer_mark;
                }
                System.out.println(outerCounter + "" + innerCounter);
            }
        }




    }
}
