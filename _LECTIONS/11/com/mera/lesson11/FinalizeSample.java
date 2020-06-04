package com.mera.lesson11;

public class FinalizeSample {




    static class ObjectWIthFin  {
        @Override
        protected void finalize() throws Throwable {
            System.out.println("Я собрался!");
        }
    }

    public static void main(String[] args) {
        ObjectWIthFin objectWIthFin = new ObjectWIthFin();
        System.gc();

        System.out.println("Перед null");
        objectWIthFin = null;



        System.gc();
        System.out.println("После null");



    }
}
