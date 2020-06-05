package com.mera.training.task10;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class ThreadHandle {

    public void getHtml(HttpDataRunnable httpData) throws IOException {

        try (InputStream inputStream = new URL(httpData.getName()).openStream()){
            long sizeInBytes = 0;
            long start = getCurrentTimeMillis();
            StringBuilder stringBuilder = new StringBuilder();
            byte[] buffer = new byte[10_000];
            int read;
            do {
                read = inputStream.read(buffer);
                stringBuilder.append(new String(buffer));
                if (read > 0) {
                    sizeInBytes += read;
                }
            } while (read != -1);
            httpData.setTimeToLoad(getCurrentTimeMillis() - start);
            httpData.setSizeInBytes(sizeInBytes);
        }
    }

    public long getCurrentTimeMillis(){
        return System.currentTimeMillis();
    }

}
