package com.mera.volosenkov.lusson10.threading;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

public class ThreadingMain {
    public static void main(String[] args)
    {
        String[] urls = {"https://career.mera.ru", "https://stackoverflow.com/", "https://habr.com"};
        Map<String, byte[]> sequenseResults = new ConcurrentHashMap<>();
        Map<String, byte[]> parallelResults = new ConcurrentHashMap<>();
        try {
            System.out.println("Sequence experiment:");
            final long startSequenseExperiment = System.nanoTime();
            InputStream[] streams = {new URL(urls[0]).openStream(), new URL(urls[1]).openStream(),new URL(urls[2]).openStream()};
            long sequenseResultSize = 0;
            for (int urlInd=0; urlInd<3; urlInd++)
            {

                byte[] urlResult = AdditionalFunctional.getBytesFromStream(streams[urlInd]);
                sequenseResultSize+= urlResult.length;
                sequenseResults.put(urls[urlInd],urlResult);
                streams[urlInd].close();
            }
            final long endSequenseExperiment = System.nanoTime();
            System.out.println("Downloading time: " + (endSequenseExperiment - startSequenseExperiment)/1000000 + " mc.");
            System.out.println("Total size: " + sequenseResultSize + " bytes");
            System.out.println("Parallel experiment:");
            final long startParallelExperiment = System.nanoTime();
            Thread[] threads = new Thread[3];
            UrlLoader[] loaders = new UrlLoader[3];
            for( int thInd = 0;thInd<3; thInd++)
            {
                loaders[thInd] = new UrlLoader();
                loaders[thInd].setUrl(urls[thInd]);
                threads[thInd] = new Thread(loaders[thInd]);
            }

            long parallelResultSize = 0;
            for( Thread th:threads)
            {
                th.start();
            }
            for( int thInd =0; thInd<3; thInd++)
            {
                threads[thInd].join();
                byte[] content = loaders[thInd].getUrlContent();
                parallelResultSize+=content.length;
                parallelResults.put(urls[thInd], content);
            }
            final long endParallelExperiment = System.nanoTime();


            System.out.println("Downloading time: " + (endParallelExperiment - startParallelExperiment)/1000000 + " mc.");
            System.out.println("Total size: " + parallelResultSize+ " bytes");

        }
        catch(IOException | InterruptedException ex)
        {
            System.out.println(ex.getMessage());
        }
    }
}
