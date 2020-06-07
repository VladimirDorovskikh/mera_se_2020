import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static int sizeI;       //sizeI - размер для последовательной загрузки
    private static int sizeII;      //sizeII - размер для параллельной загрузки

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("URLs collection: "+createURLsCollection());
        List<String> urls = createURLsCollection();
        Link link = new Link();
        System.out.println("\nSerial loading URLs:");
        long lStartTimeI = System.currentTimeMillis();
        for (String url: urls){
            link.oneLink(url);
            sizeI += link.getSize();
        }
        long lEndTimeI = System.currentTimeMillis();
        long outputI = lEndTimeI - lStartTimeI;
        //время, которое потребовалось, чтобы загрузить всё содержимое
        System.out.println("Elapsed time in milliseconds : " + outputI);
        //суммарный размер содержимого всех трех ссылок в байтах.
        System.out.println("Size of downloaded content : " + sizeI);


        System.out.println("\nParallel loading URLs:");
        long StartTimeII = System.currentTimeMillis();
        Thread url1Thead = new Thread(() -> run(urls.get(0)));
        Thread url2Thead = new Thread(() -> run(urls.get(1)));
        Thread url3Thead = new Thread(() -> run(urls.get(2)));
        url1Thead.start();
        url2Thead.start();
        url3Thead.start();
        url1Thead.join();
        url2Thead.join();
        url3Thead.join();
        long EndTimeII = System.currentTimeMillis();
        long outputII = EndTimeII - StartTimeII;
        //время, которое потребовалось, чтобы загрузить всё содержимое
        System.out.println("Elapsed time in milliseconds: " + outputII);
        //суммарный размер содержимого всех трех ссылок в байтах.
        System.out.println("Size of downloaded content : " + sizeII);

        System.out.println("\nEnd of main");
    }
    static void run(String url) {
        try {
            Link link = new Link();
            link.oneLink(url);
            sizeII = link.getSize();
        } catch (IOException | InterruptedException e) {
                e.printStackTrace();
        }
    }

    private static List<String> createURLsCollection() {
        List<String> URLs = new ArrayList<>();
        URLs.add("https://stihi.ru/editor/2020/05/06/535");
        URLs.add("https://rustih.ru/sergej-esenin-cheremuxa-dushistaya/");
        URLs.add("https://rustih.ru/aleksandr-pushkin-volshebnyj-kraj/");
        return URLs;
    }
}
