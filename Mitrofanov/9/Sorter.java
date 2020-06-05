import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;


public class Sorter {
    static Long MAX_SIZE = Long.MIN_VALUE;
    static Long MIN_SIZE = Long.MAX_VALUE;

    public static Set<File> getTree(File folder) {
        Set<File> result = new HashSet<>();
        File[] folderEntries = folder.listFiles();
        for (File entry : folderEntries) {
            if (entry.isDirectory()) {
                result.addAll(getTree(entry));
            } else {
                result.add(entry);
            }
        }
        return result;
    }

    public static void getMinFiles(Set<File> listOfFiles) {
        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (file.length() <= MIN_SIZE) {
                    MIN_SIZE = file.length();
                }
            }
        }
        for (File file : listOfFiles) {
            if (file.length() == MIN_SIZE) {
                try (FileInputStream fin = new FileInputStream(file)) {
                    System.out.printf("\nShortest file's name: %s \n File size: %d bytes \n", file.getName(), fin.available());
                    int i = -1;
                    while ((i = fin.read()) != -1) {
                        System.out.print((char) i);
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void getMaxFiles(Set<File> listOfFiles) {
        for (File file : listOfFiles) {
            if (file.isFile()) {
                if (file.length() >= MAX_SIZE) {
                    MAX_SIZE = file.length();
                }
            }
        }
        for (File file : listOfFiles) {
            if (file.length() == MAX_SIZE) {
                try (FileInputStream fin = new FileInputStream(file)) {
                    System.out.printf("\nLongest file's name: %s \n File size: %d bytes \n", file.getPath(), fin.available());
                    for (int i = 0; i < 10; i++) {
                        System.out.print((char) fin.read());
                    }
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }
}



