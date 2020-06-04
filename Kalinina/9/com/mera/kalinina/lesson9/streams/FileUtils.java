package com.mera.kalinina.lesson9.streams;

import java.io.*;
import java.util.Random;

public class FileUtils {

    // returns true if directory was created or it already exists
    // false - otherwise
    public static void createDirectory(String fullDirName) {
        File dir = new File(fullDirName);
        if (dir.exists()) {
            System.out.println("Directory " + dir.getAbsolutePath() + " already exists");
            return;
        }
        if(dir.mkdir()) {
            System.out.println("Directory " + dir.getAbsolutePath() + " was created.");
        }
        else {
            System.out.println("Directory " + dir.getAbsolutePath() + " couldn't be created.");
        }
    }

    public static void deleteDirectory(String rootDirName) {
        File dir = new File(rootDirName);
        if (!dir.isDirectory()) {
            dir.delete();
        }
        else {
            for (File item : dir.listFiles()) {
                deleteDirectory(item.getAbsolutePath());
            }
            dir.delete();
        }
    }

    // create serial nested directories in rootDirName
    // examples:
    // nestingDepth = 1: SE2020_LESSON9/1
    // nestingDepth = 2: SE2020_LESSON9/1/2
    // nestingDepth = 3: SE2020_LESSON9/1/2/3
    public static void createSerialNestedDirectories(String rootDirName, int nestingDepth) {
        if(nestingDepth > 0) {
            int subDirNumber = 1;
            while (nestingDepth != 0) {
                rootDirName += "\\" + subDirNumber;
                createDirectory(rootDirName);
                subDirNumber++;
                nestingDepth--;
            }
        }
    }

    // create random number (lowerBound, upperBound) of serial files in each
    // subdirectories of root directory (inclusive) and fill them with digits
    public static void createSerialFiles(String rootDirName, int lowerBound, int upperBound) throws IOException {
        File dir = new File(rootDirName);
        if(dir.isDirectory()) {
            for (File item : dir.listFiles()) {
                createSerialFiles(item.getAbsolutePath(), lowerBound, upperBound);
            }
            int filesNumber = Utils.getRandomIntFromInterval(lowerBound, upperBound);
            int fileSerialNumber = 1;
            while (filesNumber != 0) {
                String fileName = rootDirName + "\\" + fileSerialNumber + ".txt";
                createFile(fileName);
                fillFileWithDigits(fileName);
                fileSerialNumber++;
                filesNumber--;
            }
        }
    }

    public static void createFile(String fullFileName) throws IOException {
        File file = new File(fullFileName);
        if (file.createNewFile()) {
            System.out.println("File " + fullFileName + " is created");
        } else {
            System.out.println("File " + fullFileName + " already exists");
        }
    }

    // Fill file with random number of digits: {'0','1','2','3','4','5','6','7','8','9'}
    public static void fillFileWithDigits(String fullFileName) throws IOException {
        try (FileWriter fos = new FileWriter(fullFileName)) {
            int digitsNumber = Utils.getRandomIntFromInterval(10,200);
            while(digitsNumber != 0) {
                int digit = new Random().nextInt(10);
                fos.write(Integer.toString(digit));
                fos.flush();
                digitsNumber--;
            }
        }
    }

    public static void printFileContent(String fullFileName) throws IOException {
        byte[] bufferedBytes = new byte[500];

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fullFileName))) {
            int readBytes = 0;
            while (bufferedInputStream.read(bufferedBytes) != -1) {
                System.out.print(new String(bufferedBytes));
            }
            System.out.println();
        }
    }

    public static void printFirstNCharsFromFile(String fullFileName, byte[] bytes) throws IOException {
        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(fullFileName))) {
            System.out.println(new String(bytes, 0, bufferedInputStream.read(bytes)));
        }
    }
}
