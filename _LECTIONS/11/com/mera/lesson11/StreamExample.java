package com.mera.lesson11;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {




    public static void main(String[] args) {
        final Double avg = Stream.of(1, 3, 5, 6, 7, 9).collect(Collectors.averagingInt(i -> i));
        System.out.println(avg);


        final Optional<Integer> sum = Stream.of(1, 3, 5, 6, 7, 9).collect(Collectors.reducing((a, b) -> a + b));
        System.out.println(sum.get());


        final Map<Boolean, List<Integer>> collect = Stream.of(1, 3, 5, 6, 7, 9).collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println(collect);

    }
}
