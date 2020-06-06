package com.mera.kalinina.lesson10.threads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Map;

public class UrlUtils {

    // returns number of downloaded bytes of Url
    public static long downloadUrl(String url) throws IOException {
        long downloadedBytes = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new URL(url).openStream()))) {
            String line;
            while ((line = reader.readLine()) != null) {
                downloadedBytes += line.length();
            }
        }
        return downloadedBytes;
    }

    public static void printUrlDownloadTotalResult(Map<String, Long> urlsAndSizes, long startTime, long endTime) {
        long totalDowloadedBytes = 0;
        for(Map.Entry<String, Long> urlInfo : urlsAndSizes.entrySet()) {
            totalDowloadedBytes += urlInfo.getValue();
        }
        System.out.println("Total downloaded bytes = " + totalDowloadedBytes +
                "; Total downloaded time = " + (endTime - startTime));
        System.out.println("\n============================================================\n");
    }
}
