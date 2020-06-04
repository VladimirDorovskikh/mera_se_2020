package com.mera.lesson10;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.mera.lesson11.CompletableFutureExample;

public class ExecutorServiceSample {



    public static void main(String[] args) throws ExecutionException, InterruptedException {
        final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(4);

        final Future<String> submit = executorService.submit(() -> {
            CompletableFutureExample.doWork(1000);
            return "4";
        });


        final String taskResult = submit.get();
        System.out.println(taskResult);

    }

}
