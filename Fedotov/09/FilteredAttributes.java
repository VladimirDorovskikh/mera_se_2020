package com.mera.training.task09;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FilteredAttributes {

    private final static int DIGIT_COUNTER = 10;
    private static Long MIN_LENGTH = Long.MAX_VALUE;
    private static Long MAX_LENGTH = Long.MIN_VALUE;

    public static void minFileSizes(String path) {
        List<File> fileList = minFileSizesList(path);
        fileSizesPrint(fileList, "min", -1, MIN_LENGTH); // Read all file
    }

    public static void maxFileSizes(String path) {
        List<File> fileList = maxFileSizesList(path);
        fileSizesPrint(fileList, "max", DIGIT_COUNTER, MAX_LENGTH);  // Read first DIGIT_COUNTER symbols
    }

    public static List<File> minFileSizesList(String path) {

        List<File> resultList = new ArrayList<>();

        File dir = new File(path);
        File[] fList = dir.listFiles();
        resultList.addAll(Arrays.asList(fList));

        for (File file : fList) {
            if (file.isFile()) {
                if (file.length() <= MIN_LENGTH) {
                    MIN_LENGTH = file.length();
                }
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                resultList.addAll(minFileSizesList(file.getAbsolutePath()));
            }
        }
        System.out.println(fList);
        return resultList;
    }

    public static List<File> maxFileSizesList(String path) {

        List<File> resultList = new ArrayList<>();

        File dir = new File(path);
        File[] fList = dir.listFiles();
        resultList.addAll(Arrays.asList(fList));

        for (File file : fList) {
            if (file.isFile()) {
                if (file.length() >= MAX_LENGTH) {
                    MAX_LENGTH = file.length();
                }
                System.out.println(file.getAbsolutePath());
            } else if (file.isDirectory()) {
                resultList.addAll(minFileSizesList(file.getAbsolutePath()));
            }
        }
        System.out.println(fList);
        return resultList;
    }

    public static void fileSizesPrint(List<File> fileList, String nameSize, int sizeToRead, Long fileLength) {
        for (File file : fileList) {
            if (file.length() == fileLength) {
                System.out.println("File " + file.getAbsolutePath() + " is with " + nameSize + " size " + file.length());
                if (sizeToRead < 0) {
                    getAllFileContent(file.getAbsolutePath());
                }
                else {
                    getFileContent(file.getAbsolutePath(), sizeToRead);
                }
            }
        }
    }

    private static void getAllFileContent(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            final int maxBufferSize = 4086;

            char[] buffer = new char[maxBufferSize];
            int numberOfCharsRead = fileReader.read(buffer);
            while (numberOfCharsRead != -1) {
                System.out.println(String.valueOf(buffer, 0, numberOfCharsRead));
                numberOfCharsRead = fileReader.read(buffer);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFileContent(String fileName, int nToRead) {
        try {
            FileReader fileReader = new FileReader(fileName);
            char[] buffer = new char[nToRead];
            System.out.println(String.valueOf(buffer, 0, fileReader.read(buffer)));
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
