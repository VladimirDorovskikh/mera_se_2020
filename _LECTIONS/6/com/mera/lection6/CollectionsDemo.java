package com.mera.lection6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class CollectionsDemo {
    public static void main(String[] args) {
        Collection<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        System.out.println(numbers);
        numbers.addAll(Arrays.asList(2, 3, 4, 5));

        System.out.println(numbers);

        numbers.retainAll(Arrays.asList(3, 4, 5, 6));
        System.out.println(numbers);
        System.out.println(numbers.contains(2));


        for (Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext(); ) {
            Integer number = iterator.next();

            System.out.println("Iterating over " + number);
        }

        numbers.removeIf(new Predicate<Integer>() {

            @Override
            public boolean test(Integer o) {
                return o == 5;
            }
        });

        numbers.removeIf(o -> o == 5);


        System.out.println(numbers);
    }




}
