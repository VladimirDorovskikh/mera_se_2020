import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Random;

public class URLdownloader {

    public static void getPage(List<URL> links) throws IOException {
        try {
            int totalRead = 0;
            for (URL link : links) {
                InputStream is = link.openStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                String line;
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                    totalRead += line.length();
                }
                is.close();
            }
            System.out.println(totalRead + " Bytes downloaded");
        } catch (IOException mue) {
            mue.printStackTrace();
        }
    }

    public static File getPage(URL link, String destination) {
        Random r = new Random();
        File file = new File(destination + "" + r.nextInt(700));
        int totalRead = 0;
        try
                (BufferedInputStream in = new BufferedInputStream(link.openStream());
                 FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                fileOutputStream.write(dataBuffer, 0, bytesRead);
                totalRead += bytesRead;
            }
        } catch (IOException mue) {
            mue.printStackTrace();
        }
        System.out.println(totalRead + " Bytes downloaded");
        return file;
    }
}