package com.mera.lesson9;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Arrays;


public class PipedSample {


    public static void main(String[] args) throws IOException {


        PipedOutputStream ous = new PipedOutputStream();
        final PipedInputStream snk = new PipedInputStream();
        ous.connect(snk);

        ous.write(52);
        ous.write(50);
      //  ous.close();

        final byte[] array = new byte[2];
        snk.read(array);
        System.out.println(Arrays.toString(array));


    }
}
