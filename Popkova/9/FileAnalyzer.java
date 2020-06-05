package com.katepopkova;

import java.io.File;
import java.util.ArrayList;

public class FileAnalyzer {
    private ArrayList fileList = new ArrayList();
    private long minFileSize;
    private long maxFileSize;
    private boolean isFirstEnter = true;

    public ArrayList<File> getSmallestFiles(File directory) {
        findMinAndMaxFileSize(directory);
        System.out.println(Strings.MIN_SIZE.getValue() + minFileSize);

        addFilesToList(directory, Strings.SMALLEST);
        return fileList;
    }

    private void findMinAndMaxFileSize(File directory) {
        File[] fileList = directory.listFiles();

        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].isDirectory()) {
                findMinAndMaxFileSize(fileList[i]);
            }

            if (fileList[i].isFile()) {
                long fileLength = fileList[i].length();
                System.out.println(fileList[i].toPath().toString() + Strings.HAS_LENGTH.getValue() + fileLength);

                if (isFirstEnter) {
                    minFileSize = fileLength;
                    maxFileSize = fileLength;
                    isFirstEnter = false;
                }

                if (fileLength < minFileSize) {
                    minFileSize = fileLength;
                }

                if (fileLength > maxFileSize) {
                    maxFileSize = fileLength;
                }
            }
        }
    }

    public void addFilesToList(File directory, Strings fileType) {
        File[] fileList = directory.listFiles();

        for (int i = 0; i < fileList.length; i++) {
            if (fileList[i].isDirectory()) {
                addFilesToList(fileList[i], fileType);
            }

            if (fileList[i].isFile() && fileType.equals(Strings.SMALLEST) && fileList[i].length() == minFileSize) {
                this.fileList.add(fileList[i]);
            }

            if (fileList[i].isFile() && fileType.equals(Strings.BIGGEST) && fileList[i].length() == maxFileSize) {
                this.fileList.add(fileList[i]);
            }
        }
    }

    public void clearResources() {
        fileList.clear();
    }

    public ArrayList<File> getBiggestFiles(File directory) {
        findMinAndMaxFileSize(directory);
        System.out.println(Strings.MAX_SIZE.getValue() + maxFileSize);

        addFilesToList(directory, Strings.BIGGEST);
        return fileList;
    }
}