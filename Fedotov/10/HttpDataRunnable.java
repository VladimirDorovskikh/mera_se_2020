package com.mera.training.task10;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class HttpDataRunnable implements Runnable{
    private static long fullTime;
    private static long fullSize;

    private final String name;
    private long timeToLoad;
    private long sizeInBytes;

    public HttpDataRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            getHtmlRunnable();

            System.out.printf("%s\nTime %d, size in bytes %d%n",
                    getName(),
                    getTimeToLoad(),
                    getSizeInBytes());

            fullTime += getTimeToLoad();
            fullSize += getSizeInBytes();

            System.out.println("\nParallel reading. Time " + fullTime + ", Size " + fullSize + "\n");
        } catch (Exception err) {
            err.printStackTrace();
        }
    }

    public void getHtmlRunnable() throws IOException {

        try (InputStream inputStream = new URL(getName()).openStream()){
            long sizeInBytes = 0;
            long start = getCurrentTimeMillis();
            StringBuffer stringBuffer = new StringBuffer();
            byte[] buffer = new byte[10_000];
            int read;
            do {
                read = inputStream.read(buffer);
                stringBuffer.append(new String(buffer));
                if (read > 0) {
                    sizeInBytes += read;
                }
            } while (read != -1);
            setTimeToLoad(getCurrentTimeMillis() - start);
            setSizeInBytes(sizeInBytes);
        }
    }

    public long getCurrentTimeMillis(){
        return System.currentTimeMillis();
    }

    public String getName() {
        return name;
    }

    public long getTimeToLoad() {
        return timeToLoad;
    }

    public void setTimeToLoad(long timeToLoad) {
        this.timeToLoad = timeToLoad;
    }

    public long getSizeInBytes() {
        return sizeInBytes;
    }

    public void setSizeInBytes(Long sizeInBytes) {
        this.sizeInBytes = sizeInBytes;
    }
}

