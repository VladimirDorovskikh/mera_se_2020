package mera.multithreading;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class SiteReader implements Runnable {

    private String url;
    private byte[] urlContent;

    public SiteReader(String url) {
        this.url = url;
    }

    public byte[] getUrlContent() {
        return urlContent;
    }

    public void setUrlContent(byte[] urlContent) {
        this.urlContent = urlContent;
    }

    @Override
    public void run() {
        try (InputStream inputStream = new URL(url).openStream()){
            urlContent = inputStream.readAllBytes();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
