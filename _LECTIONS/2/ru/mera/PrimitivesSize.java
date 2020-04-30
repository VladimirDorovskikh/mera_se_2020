package ru.mera;

public class PrimitivesSize {
    public static void main(String[] args) {
        int arraySize = 10_000_000;
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            array[i] = i;
        }
        System.out.println(((Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory())/1000000d) + "mb занято");
    }
}
