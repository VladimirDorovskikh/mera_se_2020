package com.mera.volosenkov.lusson10.threading;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class AdditionalFunctional {
    public static byte[] getBytesFromStream(InputStream stream) throws IOException {
        ByteArrayOutputStream resultStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        while (true) {
            int r = stream.read(buffer);
            if (r == -1) break;
            resultStream.write(buffer, 0, r);
        }
        return resultStream.toByteArray();
    }


}
