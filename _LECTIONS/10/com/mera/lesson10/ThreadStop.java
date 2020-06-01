package com.mera.lesson10;

public class ThreadStop {


    public static void main(String[] args) throws InterruptedException {
        System.out.println("starting");
        Thread t = new Thread(() -> {
            System.out.println("Another thread is started and waiting 2000ms");

            final long start = System.currentTimeMillis();
            while (System.currentTimeMillis() - start < 2000) {

            }


            System.out.println("After 2000 ms");
        });


        t.start();
        Thread.sleep(100);
        t.stop();
        System.out.println("End of main after 1000ms");
    }

}
