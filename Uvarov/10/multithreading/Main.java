package mera.multithreading;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> urls = new ArrayList<>();
        urls.add("https://www.khl.ru/");
        urls.add("https://github.com/gladorange/mera_se_2020");
        urls.add("https://habr.com/ru/post/132884/");

        byte[] array1;
        byte[] array2;
        byte[] array3;

        final long startArray = System.nanoTime();

        try (InputStream inputStreamKHL = new URL(urls.get(0)).openStream();
             InputStream inputStreamNHL = new URL(urls.get(1)).openStream();
             InputStream inputStreamHabr = new URL(urls.get(2)).openStream()) {

            array1 = inputStreamKHL.readAllBytes();
            array2 = inputStreamNHL.readAllBytes();
            array3 = inputStreamHabr.readAllBytes();
        }
        final long endArray = System.nanoTime();

        System.out.println("Время последовательного считывания " + (endArray - startArray)/1000000 + " мс.");
        System.out.println("Суммарный размер содержимого: " + (array1.length+array2.length+array3.length) + " байт.");



        SiteReader reader1 = new SiteReader(urls.get(0));
        SiteReader reader2 = new SiteReader(urls.get(1));
        SiteReader reader3 = new SiteReader(urls.get(2));

        Thread thread1 = new Thread(reader1);
        Thread thread2 = new Thread(reader2);
        Thread thread3 = new Thread(reader3);

        final long startTime = System.nanoTime();
        thread1.start();
        thread2.start();
        thread3.start();
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        }
        catch (InterruptedException ie){
            System.out.println(ie.getMessage());
        }
        final long endTime = System.nanoTime();

        System.out.println("Время параллельного считывания " + (endTime - startTime)/1000000 + " мс.");
        System.out.println("Суммарный размер содержимого: "+ (reader1.getUrlContent().length + reader2.getUrlContent().length + reader3.getUrlContent().length) + " байт");

    }
}
