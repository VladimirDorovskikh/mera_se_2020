package ru.mera;

import java.util.Random;

public class Comments {


    public static void main(String[] args) {
        // Это одиночный комментарий
        for (int i = 0; i < 20; i++) {
            System.out.println("Случайное число - " + getRandomDouble(42d));
        }
    }


    /**
     * Возвращает #{Double} от 0 до указанной верхней границы
     * @param upperBound - верхняя граница.
     * @return число. Если верхняя граница была отрицательной - то и число будет отрицательным.
     */
    public static Double getRandomDouble(Double upperBound) {
        /*
         * nextDoulbe возвращает число от 0 до 1
         * Чтобы числа были в другом диапазоне - нужно полученное число "растянуть" до верхней границы.
         */
        return new Random().nextDouble() * upperBound;
    }
}
