package com.mera.lesson10;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadJoin {


    static long start = System.currentTimeMillis();

    public static void main(String[] args) throws InterruptedException {


        //Thread t = new Thread(() -> readFile("very-big-file"));
        Thread t = new Thread(() -> readFile("incorrect-file"));
        t.setName("Поток с плохим файлом");
        t.setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("В потоке " + t.getName() + " случилось исключение " + e.getClass().getSimpleName());
            }
        });
        t.start();

        readFile("medium-file");
       // t.join();

        System.out.println("Оба файла прочитаны");
        readFile("incorrect-file");
    }


    public static void readFile(String filename) {
        try {
            if (filename.equals("medium-file")) {
                Thread.sleep(1000);
                System.out.println(System.currentTimeMillis() - start + ": Content of medium");
            } else if (filename.equals("very-big-file")) {
                Thread.sleep(2000);
                System.out.println(System.currentTimeMillis() - start + ": Very big content");
            } else {
                throw new RuntimeException("Неизвестный файл");
            }
        } catch (InterruptedException e) {
        }
    }
}
