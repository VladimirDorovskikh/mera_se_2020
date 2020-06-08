import java.io.*;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.net.URL;

public class Link {
    private static int size;

    public static void oneLink(String url) throws IOException, InterruptedException {

        Map<String, String> URLsContent = new ConcurrentHashMap<>();        
        try {
            URL site = new URL(url);
            InputStream inputStream = (java.io.InputStream) site.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = reader.readLine()) != null) {
                URLsContent.put(url, line);
                size += line.length();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getSize() {
        return size;
    }

}
