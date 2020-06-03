package com.katepopkova;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class FileCreator {
    private static final int MIN_COUNT = 1;
    private static final int MAX_COUNT = 3;
    private static final int MIN_DIGIT_COUNT = 10;
    private static final int MAX_DIGIT_COUNT = 200;
    private static final int DIGIT_COUNT = 10;

    private File rootDir;
    private String rootDirPath;
    private int dirCount;

    public void createRootDirectory() {
        rootDir = new File(Strings.ROOT_DIRECTORY.getValue());

        if(!rootDir.exists()) {
            rootDir.mkdir();
            rootDirPath = rootDir.getPath();
        }
        else {
            System.out.println(rootDir.getName() + Strings.FOLDER_EXISTS.getValue());
        }
    }

    public void createDirTree() {
        dirCount = new Random().nextInt(MAX_COUNT - MIN_COUNT + 1) + MIN_COUNT;
        String newDirPath = rootDirPath;
        for(int i = 1; i <= dirCount; i++) {
            File dir = new File(newDirPath, Integer.toString(i));

            if(!dir.exists()) {
                dir.mkdir();
            }
            else {
                System.out.println(dir.getName() + Strings.FOLDER_EXISTS.getValue());
            }
            newDirPath =  newDirPath + Chars.SLASH.getValue() + i;
        }
    }

    public void createFiles() throws IOException{
        int filesCount = new Random().nextInt(MAX_COUNT - MIN_COUNT + 1) + MIN_COUNT;
        String newDirPath = rootDirPath;

        for(int i = 0; i <= dirCount; i++) {
            for(int j = 1; j <= filesCount; j++) {
                String fileName = makeFileName(newDirPath, j);
                File file = new File(fileName);

                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                writeDigitsToFile(bufferedWriter);
                bufferedWriter.close();
            }
            newDirPath = newDirPath + Chars.SLASH.getValue() + (i + 1);
        }
    }

    private String makeFileName(String dirPath, int number) {
        StringBuilder builder = new StringBuilder(dirPath);
        builder.append(Chars.SLASH.getValue()).append(Strings.FILE_NAME_ROOT.getValue()).append(number).append(Strings.EXPANSION.getValue());

        return builder.toString();
    }

    private void writeDigitsToFile(BufferedWriter bufferedWriter) throws IOException {
        int digitCount = new Random().nextInt(MAX_DIGIT_COUNT - MIN_DIGIT_COUNT + 1) + MIN_DIGIT_COUNT;
        for (int i = 0; i < digitCount; i++) {
            String digit = Integer.toString(new Random().nextInt(DIGIT_COUNT));
            bufferedWriter.write(digit + Chars.SPACE.getValue());
        }
    }

    public File getRootDir() {
        return rootDir;
    }
}