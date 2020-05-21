package com.mera.lection7;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.mera.lection7.reflection.Person;

public class GenericExtends {


    // Object -> Serializable -> Number
    public  static void addNumberToCollection(List<? super Number> numbers) {
        numbers.add(42L);
    }

    public static void main(String[] args) {
/*
        List<?> listOfObjects = new ArrayList<>();
        listOfObjects.add("42");
        listOfObjects.add(42);
        listOfObjects.add(new Person[42]);
        */


        addNumberToCollection(new ArrayList<Object>());

        final ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 5, 8));

        List<? extends Number> extendsNumber = integers;
        final Number number = extendsNumber.get(2); // работает
        System.out.println(number);

       // extendsNumber.add(new Long(42L));


        for (Integer integer : integers) {
            System.out.println(integer);
        }





















/*

        final ArrayList<Number> longs = new ArrayList<>();
        longs.addAll(Arrays.asList(1L, 2L, 3L, 4L));
        //List<? super Number> superNumber = new ArrayList<Long>(); // не работает
        List<? super Number> superNumber = longs;
        superNumber.addAll(Arrays.asList(5, 6d, 7L, 8f));

        List<? super Number> another = new ArrayList<Serializable>();
        final Object object = superNumber.get(0);
*/

    }
}
