package com.mera.training.task09;

import java.io.*;
import java.util.Random;

public class FileArbitrariness {

    private final static int MAX_FILE_COUNTER = 3;
    private final static int MIN_DIGIT_COUNTER = 10;
    private final static int MAX_DIGIT_COUNTER = 200;
    private final static int DIGIT_COUNTER = 10;

    public static String getFolderDelimeter() {
        return (System.getProperty("os.name").startsWith("Windows")) ? "\\" : "/";
    }

    public static boolean createDirectory(final String path) throws IOException {
        boolean retValue = false;

        final File dir = new File(path);
        if (dir.exists()) {
            throw new IOException("Directory " + dir.getAbsolutePath() + " exists.");
        }
        else if (!dir.mkdirs()) {
            throw new IOException("Unable to create " + dir.getAbsolutePath() + ".");
        }
        else {
            System.out.println("Directory "+ dir.getAbsolutePath() + " is created.");
            retValue = true;
        }

        return retValue;
    }

    public static boolean removeDirectory(File dir) {
        if (!dir.isDirectory()) {
            System.out.println("Removing file or directory : " + dir.getName());
            return dir.delete();
        } else {
            String[] subDirs = dir.list();
            for (int i = 0; i < subDirs.length; ++i) {
                File file = new File(dir, subDirs[i]);
                if (!removeDirectory(file)) {
                    System.out.println("Failure removing file or directory : " + dir.getName());
                    return false;
                }
            }
            System.out.println("Removing file or directory : " + dir.getName());
            return dir.delete();
        }
    }

    public static boolean fillRandomFiles(String path) throws IOException {
        int maxFileCounter = new Random().nextInt(MAX_FILE_COUNTER) + 1;
        String[] fileNames = {"File_01.txt", "File_02.txt", "File_03.txt"};

        for (int i = 0; i < maxFileCounter; ++i) {
            if (!createFile(path + getFolderDelimeter() + fileNames[i])) {
                return false;
            }

            if (!fillFile(path + getFolderDelimeter() + fileNames[i])) {
                return false;
            }
        }

        return true;
    }

    private static boolean createFile(String filePath) throws IOException {
        boolean retValue = false;

        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println("File " + filePath + " is created.");
            retValue = true;
        } else if (file.exists()){
            throw new IOException("File " + filePath + " exists.");
        }
        else {
            throw new IOException("Unable to create " + filePath + ".");
        }

        return retValue;
    }

    private static boolean fillFile(String filePath) throws IOException {
        boolean retValue = false;
        FileOutputStream fos = null;

        try {
            Random random = new Random();
            int maxDigitCounter = random.nextInt(MAX_DIGIT_COUNTER - MIN_DIGIT_COUNTER) + MIN_DIGIT_COUNTER;

            fos = new FileOutputStream(filePath);
            for (int i = 0; i < maxDigitCounter; i++) {
                fos.write(String.valueOf(random.nextInt(DIGIT_COUNTER - 1)).getBytes());
            }
            retValue = true;
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        finally {
            if (fos != null) {
                fos.close();
            }
        }

        return retValue;
    }
}
