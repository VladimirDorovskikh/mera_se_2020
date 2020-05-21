package com.mera.lection7;

public class GenericArray<T> {
    T[] array = (T[]) new Object[42];


    void add(T value) {
        array[0] = value;
    }

    T get() {
        return array[0];
    }


    public static void main(String[] args) {
        GenericArray<Integer> inte =new GenericArray<>();
        inte.add(42);
        System.out.println(inte.get());
    }

}

