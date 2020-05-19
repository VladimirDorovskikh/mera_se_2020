package com.mera.gokhmak.les6;

public class Task2 {
    public static void main(String[] args) throws MyArrayStoreException {
        MyArrayList<Integer> numberList = new MyArrayList<>();

        for (int i = 0; i < 10; i++) {
            numberList.add((int)((Math.random() * 11)));
        }

        System.out.printf("ДО:\n   ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.printf("%s ",  numberList.get(i).toString());
        }
        System.out.println();
        numberList.remove(o -> o.intValue() % 2 == 0);
        System.out.printf("ПОСЛЕ:\n   ");
        for (int i = 0; i < numberList.size(); i++) {
            System.out.printf("%s ",  numberList.get(i).toString());
        }
        System.out.println();
    }
}
