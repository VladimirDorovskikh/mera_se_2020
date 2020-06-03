import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    static long time;

    public static void main(String[] args) throws IOException {
        ExecutorService executor = Executors.newFixedThreadPool(10);
        long time = System.nanoTime();

        List<URL> links = new CopyOnWriteArrayList<>();
        List<File> pages = new CopyOnWriteArrayList<>();
        links.add(new URL("https://www.vk.com"));
        links.add(new URL("https://www.google.com"));
        links.add(new URL("https://www.mail.ru"));

        Callable<String> runnableTask1 = () -> {
            pages.add(URLdownloader.getPage(links.get(0), "D:\\URLs\\"));
            return "Task's execution";
        };
        Callable<String> runnableTask2 = () -> {
            pages.add(URLdownloader.getPage(links.get(1), "D:\\URLs\\"));
            return "Task's execution";
        };
        Callable<String> runnableTask3 = () -> {
            pages.add(URLdownloader.getPage(links.get(2), "D:\\URLs\\"));
            return "Task's execution";
        };
        List<Callable<String>> runnableTasks = new ArrayList<>();
        runnableTasks.add(runnableTask1);
        runnableTasks.add(runnableTask2);
        runnableTasks.add(runnableTask3);

        try {
            executor.invokeAll(runnableTasks);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        executor.shutdown();

        for (URL link : links) {
            pages.add(URLdownloader.getPage(link, "D:\\URLs\\"));
        }

        System.out.printf("Elapsed %,9.3f ms\n", time / 1_000_000.0);
    }

}
