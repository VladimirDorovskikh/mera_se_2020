package com.katepopkova;

public class DownloadThread extends Thread {
    private String link;
    private static final Downloader downloader = new Downloader();

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

    public int getTotalInformationSize() {
        return downloader.getTotalInformationSize();
    }
}
