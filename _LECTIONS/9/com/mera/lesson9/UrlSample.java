package com.mera.lesson9;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;


public class UrlSample {

    public static void main(String[] args) throws IOException {


        StringBuilder stringBuilder = new StringBuilder();

        int readOperations = 0;
        byte[] buffer = new byte[10];
        try (InputStream inputStream = new URL("https://team.mera.com/").openStream()) {
            int read = inputStream.read(buffer);
            while (read != -1) {
                stringBuilder.append(new String(buffer));
                read = inputStream.read(buffer);
                readOperations++;
            }
        }

        System.out.println("Всего операций чтения "+ readOperations);
        System.out.println(stringBuilder.toString());
    }
}
