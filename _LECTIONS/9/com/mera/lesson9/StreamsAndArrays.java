package com.mera.lesson9;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


public class StreamsAndArrays {

    public static void main(String[] args) {
        byte[] array = new byte[2];
        array[0] = (byte) 52;
        array[1] = (byte) 50;
        System.out.println("From array " + new String(array));


     /*   OutputStream stream = new ByteArrayOutputStream();
        try {
            stream.write((byte)52);
            stream.write((byte)50);
        } catch (IOException e) {
            e.printStackTrace();
        }

        stream.close();*/

        try (OutputStream stream = new ByteArrayOutputStream()) {
            stream.write((byte) 52);
            stream.write((byte) 50);

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream inputStream = getInputStream(array);
            byte[] read = new byte[2];
            read[0] = (byte)inputStream.read();
            read[1] = (byte)inputStream.read();

            System.out.println("From Input stream " + new String(read));


            InputStream anotherInput = getInputStream(array);

            final byte[] bytes = new byte[6];
            anotherInput.read(bytes);
            System.out.println("From Input stream short " + new String(bytes));
        } catch (IOException e) {
            System.out.println();
        }



    }

    private static InputStream getInputStream(byte[] array) {
        return new ByteArrayInputStream(array);
    }


}
