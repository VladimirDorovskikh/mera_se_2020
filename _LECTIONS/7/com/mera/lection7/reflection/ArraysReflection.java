package com.mera.lection7.reflection;

import java.lang.reflect.Array;

public class ArraysReflection {

    public static void main(String[] args) {
        int[] array = (int[]) Array.newInstance(int.class, 3);
        final Class<? extends int[]> aClass = array.getClass();
        System.out.println(aClass);
        System.out.println(Array.getLength(array));


        Array.set(array, 1, 42);
        System.out.println(Array.get(array, 1));

        System.out.println(array.getClass().getComponentType());

    }

}
