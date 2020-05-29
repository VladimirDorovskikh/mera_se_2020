package com.mera.lesson9;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class FileReading {

    public static void main(String[] args) throws IOException {

        byte[] bytes = new byte[10_000];
        byte[] anotherBytes = new byte[10_000];
        byte[] bufferedBytes = new byte[10_000];




        final long startByteByByte = System.nanoTime();


        try (FileInputStream fis = new FileInputStream("C:/Users/atarasov/Desktop/собеседование.txt")) {
            int index = 0;
            int readByte = fis.read();
            while (readByte != -1) {
                bytes[index++] = (byte) readByte;
                readByte = fis.read();
            }
        }
        final long endByByByte = System.nanoTime();



        final long startArray = System.nanoTime();

        int readBytesCount = 0;
        try (FileInputStream fis = new FileInputStream("C:/Users/atarasov/Desktop/собеседование.txt")) {
            readBytesCount = fis.read(anotherBytes);
        }


        final long startBuffered = System.nanoTime();


        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("C:/Users/atarasov/Desktop/собеседование.txt"))) {
             int readBytes = bufferedInputStream.read(bufferedBytes);
        }

        final long endByBuffered = System.nanoTime();
        final long endArray = System.nanoTime();

        System.out.println("Время байт за байтом " + (endByByByte - startByteByByte));
        System.out.println("Время массив " + (endArray - startArray));
        System.out.println("Время буффериовано " + (endByBuffered - startBuffered));

/*


        System.out.println(new String(bytes));
        System.out.println(new String(anotherBytes));


        System.out.println(readBytesCount);


        try (FileOutputStream fos = new FileOutputStream("C:/Users/atarasov/Desktop/собеседование_copy.txt")) {
            fos.write(bytes, 0, readBytesCount);
        }


        try (FileOutputStream fos = new FileOutputStream("C:/Users/atarasov/Desktop/собеседование_copy_another.txt")) {
            fos.write(anotherBytes, 0, readBytesCount);
        }
*/



        //System.out.println(Arrays.toString(anotherBytes));
      //  System.out.println(Arrays.toString(bytes));





    }
}
