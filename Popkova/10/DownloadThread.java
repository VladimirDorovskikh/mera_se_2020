package com.katepopkova;

public class DownloadThread extends Thread {

    private static final Downloader downloader = new Downloader();

    private String link;

    public DownloadThread(String link) {
        this.link = link;
    }

    @Override
    public void run() {
        downloader.downloadInformation(link);
    }

    public long getDownloadTime() {
        return downloader.getDownloadTime();
    }

    public int getInformationSize() {
        return downloader.getInformationSize();
    }
}
