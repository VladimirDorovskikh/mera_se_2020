package com.mera.lesson10;

import java.util.HashSet;
import java.util.Set;

public class ThreadInterrupted {




    public static void main(String[] args) throws InterruptedException {


        Set<String> tasks = new HashSet<>();
        tasks.add("Считать что-то сложное");
        tasks.add("Отправлять запрос в сеть");
        tasks.add("Записывать в большой файл");


        Runnable r = () -> {

            for (String task : tasks) {

                System.out.println("Начинаю обрабатывать задачу " + task);
                try {
                    Thread.sleep(100_000);
                } catch (InterruptedException e) {
                    System.out.println("Задача остановлена, принимаюсь за следующую задачу");
                }
            }

        };


        Thread t = new Thread(r);
        t.start();
        Thread.sleep(1000);
        System.out.println("Прерываю первую задачу");
        t.interrupt();
        Thread.sleep(1000);
        System.out.println("Прерываю вторую задачу");
        t.interrupt();
        Thread.sleep(1000);
        System.out.println("Прерываю третью задачу");
        t.interrupt();




    }
}
