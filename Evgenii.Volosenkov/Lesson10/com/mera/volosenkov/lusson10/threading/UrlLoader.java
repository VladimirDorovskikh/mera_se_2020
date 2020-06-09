package com.mera.volosenkov.lusson10.threading;


import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class UrlLoader implements Runnable {
    private String url;
    private byte [] urlContent;

    public byte[] getUrlContent() {
        return urlContent;
    }

    @Override
    public void run() {
        try {
            URL urlHandler = new URL(url);
            InputStream urlStream = urlHandler.openStream();
            urlContent = AdditionalFunctional.getBytesFromStream(urlStream);
            urlStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void setUrl(String url) {
        this.url = url;
    }
}
