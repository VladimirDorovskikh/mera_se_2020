package com.katepopkova;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
    private static final int BEGIN_INDEX = 0;
    private static final int END_INDEX = 19;

    private static FileCreator fileCreator = new FileCreator();
    private static FileVisitor fileVisitor = new FileVisitor();
    private static FileAnalyzer fileAnalyzer = new FileAnalyzer();
    private static Path rootDirPath;

    public static void main(String[] args) {
        File rootDir;

        try {
            createFiles();

            rootDir = fileCreator.getRootDir();
            rootDirPath = rootDir.toPath();
            Files.walkFileTree(rootDirPath, fileVisitor);
            System.out.println();

            findAndPrintSmallestFiles(rootDir);
            System.out.println();

            findAndPrintBiggestFiles(rootDir);

            deleteDirectory(rootDir);
            System.out.println(Strings.FILES_HAVE_BEEN_DELETED.getValue());
        }
        catch(IOException | NullPointerException ex) {
            System.out.println(Strings.FAILED_OPERATION.getValue());
        }
    }

    public static void createFiles() throws IOException, NullPointerException { ;
        fileCreator.createRootDirectory();
        fileCreator.createDirTree();
        fileCreator.createFiles();
    }

    public static void findAndPrintSmallestFiles(File directory) throws IOException {
        ArrayList<File> smallestFileList = fileAnalyzer.getSmallestFiles(directory);

        for(File file : smallestFileList) {
            System.out.println(Strings.SMALLEST_FILES.getValue() + file) ;

            BufferedReader fin = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fin.readLine()) != null) {
                System.out.println(line + Chars.NEW_STRING.getValue());
            }
        }

        fileAnalyzer.clearResources();
    }

    public static void findAndPrintBiggestFiles(File directory) throws IOException{
        ArrayList<File> biggestFileList = fileAnalyzer.getBiggestFiles(directory);

        for (File file : biggestFileList) {
            System.out.println(Strings.BIGGEST_FILES.getValue() + file);

            BufferedReader fin = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fin.readLine()) != null) {
                String firstTenChars = line.substring(BEGIN_INDEX, END_INDEX);
                System.out.println(firstTenChars + Chars.NEW_STRING.getValue());
            }
        }

        fileAnalyzer.clearResources();
    }

    public static void deleteDirectory(File directory) {
        if (directory.isDirectory()) {
            String[] children = directory.list();

            for (int i=0; i<children.length; i++) {
                File file = new File(directory, children[i]);
                deleteDirectory(file);
            }

            directory.delete();
        }
        else {
            directory.delete();
        }
    }
}