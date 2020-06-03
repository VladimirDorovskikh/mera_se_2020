import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
     // Task 1 // making and filling directories
        Path dir = Paths.get("D://SE2020_LESSON9");

        List<String> dirs = Creator.makeDirectories("D://SE2020_LESSON9");
        Creator.createFiles(dirs);
        FilePrintWalker filePrinter = new FilePrintWalker();
        Files.walkFileTree(dir, filePrinter);

    // Task 2 // Sorting stuff // deleting stuff
        File folder = new File("D://SE2020_LESSON9");
        Sorter.getMinFiles(Sorter.getTree(folder));
        Sorter.getMaxFiles(Sorter.getTree(folder));
        Creator.deleteDirectoryRecursion(dir);

    }
}
