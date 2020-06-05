package com.katepopkova;

import java.util.concurrent.*;

public class Main {
    private static final String INNER_CLASSES_LINK = "https://javarush.ru/groups/posts/2181-vlozhennihe-vnutrennie-klassih";
    private static final String LOCAL_CLASSES_LINK = "https://javarush.ru/groups/posts/2190-vnutrennie-klassih-v-lokaljhnom-metode";
    private static final String NESTED_CLASSES_LINK = "https://javarush.ru/groups/posts/2183-staticheskie-vlozhennihe-klassih";
    private static final String TOTAL_DOWNLOAD_TIME = "Total download time (nanoseconds): ";
    private static final String TOTAL_INFORMATION_SIZE = "Total information size (chars): ";
    private static final CopyOnWriteArrayList<String> linkList = new CopyOnWriteArrayList<>();
    private static final Downloader downloader = new Downloader();

    public static void main(String[] args) {
        addElementsToCollection();

        downloadInformationInCurrentThread();
        System.out.println();

        downloadInformationInParallelThread();
    }

    private static void addElementsToCollection() {
        linkList.add(INNER_CLASSES_LINK);
        linkList.add(LOCAL_CLASSES_LINK);
        linkList.add(NESTED_CLASSES_LINK);
    }

    public static void downloadInformationInCurrentThread() {
        for(String link : linkList) {
            downloader.downloadInformation(link);
        }

        System.out.println(TOTAL_DOWNLOAD_TIME + downloader.getDownloadTime());
        System.out.println(TOTAL_INFORMATION_SIZE + downloader.getInformationSize());
    }

    public static void downloadInformationInParallelThread() {
        long totalDownloadTime = 0;
        int totalInformationSize = 0;

        for(int i = 0; i < linkList.size(); i++) {
            final DownloadThread downloadThread = new DownloadThread(linkList.get(i));
            downloadThread.run();
            totalDownloadTime += downloadThread.getDownloadTime();
            totalInformationSize =+ downloadThread.getInformationSize();
        }

        System.out.println(TOTAL_DOWNLOAD_TIME + totalDownloadTime);
        System.out.println(TOTAL_INFORMATION_SIZE + totalInformationSize);
    }
}
