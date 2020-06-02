package com.mera.training.task09;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.stream.Stream;

public class Task0901 {
    public static void main(String[] args) throws IOException {
        final String myTrainingDir = "SE2020_LESSON9";

        FileArbitrariness fileArbitrariness = new FileArbitrariness();
        final Path pathInitial = Paths.get(Paths.get("").toAbsolutePath() + fileArbitrariness.getFolderDelimeter() + myTrainingDir);
        String pathString = pathInitial.toString();

        final int maxFolderCouter =new Random().nextInt(2) + 1;
        for (int i = 0; i < maxFolderCouter; ++i) {
            pathString = pathString + fileArbitrariness.getFolderDelimeter() + (i + 1);
        }
        System.out.println(pathString);

        if (fileArbitrariness.createDirectory(pathString)) {

            final Stream<Path> paths = Files.walk(Paths.get(pathInitial.toString()));
            for (Object dir : paths.toArray()) {
                System.out.println(dir.toString());

                if (fileArbitrariness.fillRandomFiles(dir.toString())) {
                    System.out.println("Files filled successfully in directory " + dir.toString());
                }
            }
            System.out.println("\nAll created files and directories filled successfully.\n");

            FilteredAttributes filteredAttributes = new FilteredAttributes();
            filteredAttributes.minFileSizes(pathInitial.toString());
            filteredAttributes.maxFileSizes(pathInitial.toString());
        }

        if (fileArbitrariness.removeDirectory(pathInitial.toFile())) {
            System.out.println("\nAll created files and directories removed successfully.");
        }
    }
}
