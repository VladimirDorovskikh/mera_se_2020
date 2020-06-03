import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import static java.nio.file.Files.newDirectoryStream;
import static java.util.Objects.*;

public class Creator {

    public static List<String> makeDirectories(String toDir) {
        final int NEST_LIMIT = 4;
        Random r = new Random();
        List<String> result = new ArrayList<>();
        File file = new File(toDir);
        if (!file.exists()) {
            for (int i = 1; i < NEST_LIMIT; ) {
                result.add(toDir);
                file.mkdir();
                toDir = toDir.concat("/" + i);
                file = new File(toDir);
                i++;
            }
        } else {
            System.out.println("Directory already exist");
        }
        return result;
    }

    public static void createFiles(String dir) {
        StringBuilder result = new StringBuilder();
        Random r = new Random();
        Random r2 = new Random();
        int qtyOfFiles = r.nextInt(50);
        for (int i = 1; i <= qtyOfFiles; i++) {
            File file = new File(dir + "\\File_" + i + ".txt");
            for (int j = 0; j < r.nextInt(200 + 10) + 1; j++) {
                result.append(r2.nextInt(9));
            }
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                writer.append(result);
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void createFiles(List<String> listOfDir) {
        StringBuilder result = new StringBuilder();
        Random r = new Random();
        Random r2 = new Random();
        for (String dir : listOfDir) {
            int qtyOfFiles = r.nextInt(4);
            for (int i = 1; i <= qtyOfFiles; i++) {
                File file = new File(dir + "\\File_" + i + ".txt");
                for (int j = 0; j < r.nextInt(200 + 10) + 1; j++) {
                    result.append(r2.nextInt(9));
                }
                try {
                    BufferedWriter writer = new BufferedWriter(new FileWriter(file));
                    writer.append(result);
                    writer.flush();
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void deleteDirectoryRecursion(Path path) throws IOException {
        if (Files.isDirectory(path, LinkOption.NOFOLLOW_LINKS)) {
            try (DirectoryStream<Path> entries = Files.newDirectoryStream(path)) {
                for (Path entry : entries) {
                    deleteDirectoryRecursion(entry);
                }
            }
        }
        Files.delete(path);
    }
}



