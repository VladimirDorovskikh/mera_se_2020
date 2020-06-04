package com.mera.lesson10;

import java.util.ArrayList;

import com.mera.lesson11.CompletableFutureExample;

public class WaitNotifyExample {

    static final Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        ArrayList<String> tasks = new ArrayList<>();
        ArrayList<String> answer = new ArrayList<>();

        Thread computer = new Thread(new Runnable() {
            @Override
            public void run() {

                final String next = tasks.get(0);
                tasks.remove(0);

                CompletableFutureExample.doWork(2000);
                if (next.equals("2+2")) {
                    answer.add("4");
                    synchronized (lock) {
                        lock.notify();
                    }
                }
            }
        });


        tasks.add("2+2");
        computer.start();
        synchronized (lock) {
            while (answer.isEmpty()) {
                lock.wait();
            }
        }
        System.out.println(answer.get(0));

    }
}
