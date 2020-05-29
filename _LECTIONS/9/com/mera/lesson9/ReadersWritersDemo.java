package com.mera.lesson9;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ReadersWritersDemo {
    public static void main(String[] args) throws IOException {
        try (FileWriter fos = new FileWriter("my-file.txt")) {
            fos.write(getSomeText());
        }

        char[] buf = new char[20];
        try (FileReader fos = new FileReader("my-file.txt")) {
            fos.read(buf);
        }

        System.out.println(new String(buf));

    }

    private static String getSomeText() {
        return "<Hello,World!>";
    }
}
