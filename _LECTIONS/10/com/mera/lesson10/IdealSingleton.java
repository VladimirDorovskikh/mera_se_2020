package com.mera.lesson10;

import java.time.LocalDateTime;

public class IdealSingleton {

    static Object lock = new Object();

    static volatile IdealSingleton instance;

    private IdealSingleton() {

    }

    public  static IdealSingleton getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    System.out.println("Создан экземпляр синглтона");
                    instance = new IdealSingleton();
                }
            }
        }
        return instance;
    }

    public  String getCurrentTime() {
        return LocalDateTime.now().toString();
    }




    public static void main(String[] args) {
        /*final IdealSingleton instance = IdealSingleton.getInstance();
        System.out.println(instance.getCurrentTime());

        final IdealSingleton instance2 = IdealSingleton.getInstance();
        System.out.println(instance2.getCurrentTime());*/


        Thread t1 = new Thread(() -> IdealSingleton.getInstance());
        Thread t2 = new Thread(() -> IdealSingleton.getInstance());
        t1.start();
        t2.start();


    }

}
