package com.mera.lesson11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class CollectionsAndThreads {


    //static Map<Integer, String> numbers1 = new HashMap<>();
    //static Map<Integer, String> numbers1 = new ConcurrentHashMap<>();


    static List<Integer> numbers1 = new CopyOnWriteArrayList<>();
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10_000; i++) {
                numbers1.add(i);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(5);
                System.out.println("Вывожу на экран");
                for (Integer integer : numbers1) {
                    System.out.println(integer);
                }

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println(numbers1.size());
    }


}
