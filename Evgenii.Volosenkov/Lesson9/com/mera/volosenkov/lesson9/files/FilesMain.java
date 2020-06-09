package com.mera.volosenkov.lesson9.files;

import sun.reflect.generics.visitor.Visitor;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;

public class FilesMain {
    private static Random rand = new Random();
    private  static final int MAX_NESTED_LEVEL = 3;
    public static void main(String[] args)
    {
        Path root = Paths.get(Paths.get("").toAbsolutePath().toString(), "SE2020_LESSON9");
        Path deepfolder = root;
        int nestedLevel = rand.nextInt(MAX_NESTED_LEVEL)+1;
        for( Integer curLevel = 1; curLevel<=nestedLevel; curLevel++)
        {
            deepfolder = Paths.get(deepfolder.toString(), curLevel.toString());
        }
        FileManager.createDirectory(deepfolder.toString());
        Path iterPath = deepfolder;
        while(!iterPath.equals(root))
        {
            String currentNestedFolder = Paths.get(iterPath.toString()).getFileName().toString();
            String randomFileName = "File_"+currentNestedFolder+ ".rand";
            String fullRandomFileName = Paths.get(iterPath.toString(), randomFileName).toString();
            System.out.println(fullRandomFileName);
            try
            {
                File file = FileManager.createFile(fullRandomFileName);
                FileManager.writeToFile(fullRandomFileName, genRandomContentForFile(rand.nextInt(190) + 10));
            }
            catch(Exception ex)
            {
                System.out.print(ex.getMessage());
            }
            iterPath = iterPath.getParent();
        }
        try {
            System.out.println("Files:");
            List<String> files = FileManager.getNestedFiles(root);
            System.out.println(files);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return;
        }
        try {
            printInfoAboutSmallestAndBiggestFiles(root);
            System.out.println("deleting folder " + root.toString());
            FileManager.deletePath(root);
        }
        catch(Exception ex)
        {
            System.out.println(ex.getMessage());
            return;
        }
    }
    private static String genRandomContentForFile(int numChars)
    {
        StringBuilder result = new StringBuilder();
        for(int indChar = 0; indChar< numChars;indChar++)
        {
            result.append(String.valueOf(rand.nextInt(10)));
        }
        return result.toString();
    }

    private static void printInfoAboutSmallestAndBiggestFiles(Path rootPath) throws IOException {

        VisitorChecker checker =  new VisitorChecker();
        Files.walkFileTree(rootPath, checker);
        System.out.println("Info About smallest files with size " + checker.getMinSize()+" :");
        for(String smallFile:checker.getFilePathsWithMinSize())
        {
            System.out.println("File: "+ smallFile);

            System.out.println("File content: "+ FileManager.readFromFile(smallFile));
        }

        System.out.println("Info About biggest files with size " + checker.getMaxSize()+" :");
        for(String smallFile:checker.getFilePathsWithMinSize())
        {
            System.out.println("File: "+ smallFile);

            System.out.println("File content: "+ FileManager.readFromFile(smallFile).substring(0,10) +"...");
        }
    }
}
