package com.mera.lesson10;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ThreadInterrupted {




    public static class Runner {
        void runTasks(Collection<String> tasks) throws InterruptedException {

            for (String task : tasks) {
                System.out.println("Начинаю обрабатывать задачу " + task);
                final long start = System.currentTimeMillis();
                while ( System.currentTimeMillis() - start <  100_000) {
                    if (Thread.currentThread().isInterrupted()) {
                        Thread.interrupted();
                        throw new InterruptedException();
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {


        Set<String> tasks = new HashSet<>();
        tasks.add("Считать что-то сложное");
        tasks.add("Отправлять запрос в сеть");
        tasks.add("Записывать в большой файл");


        Runnable r = () -> {
            try {
                new Runner().runTasks(tasks);
            } catch (InterruptedException e) {
                System.out.println("Поток прервали");
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
