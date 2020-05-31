package mera.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        String[] directoriesPath = {
                Paths.get("").toAbsolutePath() + ("/SE2020_LESSON9/1"),
                Paths.get("").toAbsolutePath() + ("/SE2020_LESSON9/1/2"),
                Paths.get("").toAbsolutePath() + ("/SE2020_LESSON9/1/2/3")};

        Random rnd = new Random();
        int numberOfFolders = rnd.nextInt(2);
        System.out.println("numberOfFolders: " + (numberOfFolders + 1));
        String directoryPath = directoriesPath[numberOfFolders];
        FileCreator.createDirectory(directoryPath);


        Path pathSource = Paths.get(Paths.get("").toAbsolutePath() + ("/SE2020_LESSON9"));

        System.out.println("Paths of created files: ");
        Files.walkFileTree(pathSource, new MyFileVisitor());

        SearchingFileVisitor searchingFileVisitor = new SearchingFileVisitor();
        Files.walkFileTree(pathSource, searchingFileVisitor);
        System.out.println("Sizes of files: ");
        System.out.println(searchingFileVisitor.getFileSizesValues().values());

        System.out.println("\nFiles with min size: ");
        FileCreator.printMinSizeFiles(searchingFileVisitor.getFileSizesValues());

        System.out.println("First 10 symbols in files with max size: ");
        FileCreator.printMaxSizeFiles(searchingFileVisitor.getFileSizesValues());

        FileCreator.deleteDirectory(pathSource.toFile());
    }
}
