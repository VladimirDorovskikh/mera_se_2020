package com.mera.lesson10;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class DeadLockExample {
    static Object oneMonitor = new Object();
    static Object anotherMonitor = new Object();


    public static void main(String[] args) throws InterruptedException {
        final LockAnotherThenOneThread firstThread = new LockAnotherThenOneThread();
        firstThread.start();
        final LockOneThenAnotherThread secndThread = new LockOneThenAnotherThread();
        secndThread.start();
        System.out.println("Конец main");
    }

    static class LockOneThenAnotherThread extends Thread{
        @Override
        public void run() {

            synchronized (oneMonitor) {
                System.out.println("Поток 1:Один монитор захвачен");
                try {
                    Thread.sleep(1000);
                    synchronized (anotherMonitor) {
                        System.out.println("Оба монитора захвачены");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    static class LockAnotherThenOneThread extends Thread{
        @Override
        public void run() {

            synchronized (anotherMonitor) {
                System.out.println("Поток 2:Один монитор захвачен");
                try {
                    Thread.sleep(1000);
                    synchronized (oneMonitor) {
                        System.out.println("Оба монитора захвачены");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }





}
