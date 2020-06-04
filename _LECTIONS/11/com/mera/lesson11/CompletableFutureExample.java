package com.mera.lesson11;

import java.util.concurrent.CompletableFuture;





public class CompletableFutureExample {

    public static void doWork(long time) {
        final long start = System.currentTimeMillis();
        while (System.currentTimeMillis() - start < time) {}

    }

    public static void main(String[] args) throws InterruptedException {
        final CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            doWork(1000L);
            return "<результат работы>";

        });


        stringCompletableFuture.thenAccept(value -> System.out.println("Работа завершилась с результатом " + value));


        System.out.println("Конец main");
        Thread.sleep(2000L);
    }
}
