package com.mera.training.task10;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task1001 {
    public static void main(String[] args) throws IOException {

        List<HttpDataRunnable> httpData = new ArrayList<>();

        httpData.add(new HttpDataRunnable("https://www.google.ru/"));
        httpData.add(new HttpDataRunnable("https://www.mera.com/"));
        httpData.add(new HttpDataRunnable("https://outlook.office.com/"));

        ThreadHandle threadHandle = new ThreadHandle();
        long fullTime = 0;
        long fullSize = 0;
        for (HttpDataRunnable data : httpData) {
            threadHandle.getHtml(data);
            System.out.printf("%s\nTime %d, size in bytes %d%n", data.getName(), data.getTimeToLoad(), data.getSizeInBytes());
            fullTime += data.getTimeToLoad();
            fullSize += data.getSizeInBytes();
        }
        System.out.println("\nSequential reading. Time " + fullTime + ", Size " + fullSize + "\n");

        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        try {
            List<HttpDataRunnable> httpDataRunnables = new ArrayList<>();

            httpDataRunnables.add(new HttpDataRunnable("https://www.google.ru/"));
            httpDataRunnables.add(new HttpDataRunnable("https://www.mera.com/"));
            httpDataRunnables.add(new HttpDataRunnable("https://outlook.office.com/"));

            for (int i = 0; i < httpDataRunnables.size(); i++) {
                Future<?> result =executor.submit(new HttpDataRunnable(httpDataRunnables.get(i).getName()));
                System.out.println(result.get());
             }
        } catch (Exception err) {
            err.printStackTrace();
        }
        executor.shutdown();
    }
}
