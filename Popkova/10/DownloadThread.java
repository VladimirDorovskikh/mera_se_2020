package com.katepopkova;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class DownloadThread extends Thread {
    private static final String INTERRUPTED_OR_FAILED_IO_OPERATION = "Some I/O operation has been interrupted or failed.";

    private String link;
    private long downloadTime;
    private int totalInformationSize;

    public DownloadThread(String link) {
        this.link = link;
    }

    @Override
    public void run() {
        long beginTime = System.nanoTime();

        try {
            URL url = new URL(link);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openConnection().getInputStream()));
            String content;

            while ((content = bufferedReader.readLine()) != null) {
                totalInformationSize += content.length();
            }

            bufferedReader.close();
        }
        catch (IOException ex) {
            System.out.println(INTERRUPTED_OR_FAILED_IO_OPERATION);
        }

        downloadTime = System.nanoTime() - beginTime;
    }

    public long getDownloadTime() {
        return downloadTime;
    }

    public int getTotalInformationSize() {
        return totalInformationSize;
    }
}