package ru.mera;

public class ObjectSize {
    public static void main(String[] args) {
        int arraySize = 10_000_000;
        Integer[] array = new Integer[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = new Integer(i);
        }
        System.out.println(((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1000000d) + "mb занято");
    }
}
