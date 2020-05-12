package iljicheva.lesson2;

import java.util.Random;

public class task3 {
    public static void main(String[] args) {
        int[] sevenNumsArrayFirst = new Random().ints(7, 0, 110).toArray();
        int[] sevenNumsArraySecond = new Random().ints(7, -110, 0).toArray();
        int[] sevenNumsArrayThird = new int[7];
        String lineResultFirst = "";
        String lineResultSecond = "";
        String lineResultThird = "";

        for(int i = 0; i < sevenNumsArrayFirst.length; i++){
            lineResultFirst += sevenNumsArrayFirst[i] + " ";
            lineResultSecond += sevenNumsArraySecond[i] + " ";
            sevenNumsArrayThird[i] = sevenNumsArrayFirst[i] + sevenNumsArraySecond[i];
            lineResultThird += sevenNumsArrayThird[i] + " ";
        }
        System.out.println("First array: " + lineResultFirst);
        System.out.println("Second array: " + lineResultSecond);
        System.out.println("third array, where each num is sum nums from first and second arrays: " + lineResultThird);
    }
}
