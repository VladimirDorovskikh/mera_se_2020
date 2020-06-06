package com.mera.kalinina.lesson10.threads;

/*
Задание 10. Многопоточность.
1. Создайте коллекцию из трех http ссылок
2. Загрузите содержимое всех трем ссылкам последовательно.
3. Выведите на экран:
- время, которое потребовалось, чтобы загрузить всё содержимое
- суммарный размер содержимого всех трех ссылок в байтах.
4. Теперь загрузите содержимое параллельно, используя три потока, выведите на экран тоже самое (время и размер).
Советы:
- Для хранения содержимого разных ссылок используйте потокобезопасные коллекции:
ConcurrentHashMap,ConcurrentHashSet, CopyOnWriteArrayList, ConcurrentLinkedQueue
- Для получения содержимого используйте new URL().openStream() (не забывайте закрывать поток)

 */

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class Task1 {

    public static void main(String[] args) throws IOException, InterruptedException, ExecutionException {

        final String[] urls = {"https://www.bbc.com/news/science-environment-52840482",
                "https://www.bbc.com/news/science-environment-52818543",
                "https://www.bbc.com/news/science-environment-52739539"};

        // Test 1: Sequential url download
        Map<String, Long> urlsAndSizesSequential = new HashMap<>();
        final long startTime1 = System.currentTimeMillis();
        for (String url : urls) {
            urlsAndSizesSequential.put(url, UrlUtils.downloadUrl(url));
        }
        final long endTime1 = System.currentTimeMillis();

        System.out.println("Test 1: Sequential url download");
        UrlUtils.printUrlDownloadTotalResult(urlsAndSizesSequential, startTime1, endTime1);

        // Test 2: Concurrent url download - V.1 (using of Threads)
        Map<String, Long> urlsAndSizesConcurrent = new ConcurrentHashMap<>();
        List<Thread> threadList = new ArrayList<>();
        for (String url : urls) {
            threadList.add(new Thread(() -> {
                try {
                    urlsAndSizesConcurrent.put(url, UrlUtils.downloadUrl(url));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        }
        final long startTime2 = System.currentTimeMillis();
        for(Thread thread : threadList) {
            thread.start();
        }
        for(Thread thread : threadList) {
            thread.join();
        }
        final long endTime2 = System.currentTimeMillis();

        System.out.println("Concurrent url download - V.1 (using of Threads)");
        UrlUtils.printUrlDownloadTotalResult(urlsAndSizesConcurrent, startTime2, endTime2);


        // Test 3: Concurrent url download - V.2 (using of ExecutorService)
        Map<String, Long> urlsAndSizesConcurrentExe = new ConcurrentHashMap<>();
        ExecutorService service = Executors.newFixedThreadPool(3);
        final long startTime3 = System.currentTimeMillis();
        for (String url : urls) {
            Future<Long> result = service.submit(() -> {
                return UrlUtils.downloadUrl(url);
                    });
            urlsAndSizesConcurrentExe.put(url, result.get());
        }
        final long endTime3 = System.currentTimeMillis();
        service.shutdown();

        System.out.println("Concurrent Test V.1");
        UrlUtils.printUrlDownloadTotalResult(urlsAndSizesConcurrentExe, startTime3, endTime3);

    }
}
