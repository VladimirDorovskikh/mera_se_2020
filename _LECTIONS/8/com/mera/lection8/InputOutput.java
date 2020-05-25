package com.mera.lection8;

import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {

    public static void main(String[] args) {
        try (FileWriter fileWriter = new FileWriter("some-file.txt")){
            fileWriter.write("Какая-то строка");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
