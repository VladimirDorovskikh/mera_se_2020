package mera.files;

import java.io.*;
import java.util.*;

public class FileCreator {
    private final static int MAXIMUM_NUMBER_OF_FILES = 3;
    private final static int MIN_NUMBER_OF_DIGITS = 10;
    private final static int MAX_NUMBER_OF_DIGITS = 200;
    private final static int NUMBER_OF_DIGITS = 10;

    public static void createDirectory(String pathToDirectory) {
        final File dir1 = new File(pathToDirectory);
        if (!dir1.exists()) {
            if (dir1.mkdirs()) {
                System.out.println("Kaтaлoг " + dir1.getAbsolutePath() + " ycпeшнo coздaн.");
            } else {
                System.out.println("Kaтaлoг " + dir1.getAbsolutePath() + " coздать нe yдaлocь.");
            }
        } else {
            System.out.println("Kaтaлoг " + dir1.getAbsolutePath() + " yжe cyщecтвyeт.");
        }
    }

    public static void createRandomFiles(String directoryPath) throws IOException {
        Random rnd = new Random();
        int numberOfFiles = rnd.nextInt(MAXIMUM_NUMBER_OF_FILES)+1;
        String[] fileNames = {"Name_1.txt", "Name_2.txt", "Name_3.txt"};
        for (int i = 1; i <= numberOfFiles; i++) {
            createFile(directoryPath + "\\" + fileNames[i-1]);
            fillFile(directoryPath + "\\" + fileNames[i-1]);
        }
    }

    private static void createFile(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.createNewFile()) {
            System.out.println(filePath + " Файл ycпeшнo создан");
        } else {
            System.out.println("Файл " + filePath + " уже существует");
        }
    }

    public static void fillFile(String filePath) throws IOException {
        Random rnd = new Random();

        try (FileOutputStream fos = new FileOutputStream(filePath)) {

            int numberOfDigits = rnd.nextInt(MAX_NUMBER_OF_DIGITS - MIN_NUMBER_OF_DIGITS) + MIN_NUMBER_OF_DIGITS;

            for (int i = 0; i < numberOfDigits; i++) {
                fos.write(String.valueOf(rnd.nextInt(NUMBER_OF_DIGITS-1)).getBytes());
            }
        }
    }

    public static void printMinSizeFiles(Map<String, Long> map) {
        long minSize = Long.MAX_VALUE;
        for (Map.Entry<String, Long> pair : map.entrySet()) {
            if (pair.getValue() <= minSize) {
                minSize = pair.getValue();
            }
        }

        for (Map.Entry<String, Long> pair : map.entrySet()) {
            if (pair.getValue().equals(minSize)) {
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pair.getKey()))) {
                    System.out.println(pair.getKey());
                    System.out.println(getFileContent(bufferedInputStream));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static String getFileContent(BufferedInputStream bufferedInputStream) throws IOException {
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(bufferedInputStream))) {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line);
                stringBuilder.append('\n');
            }
            return stringBuilder.toString();
        }
    }

    public static void printMaxSizeFiles(Map<String, Long> map) {
        long minSize = Long.MIN_VALUE;
        for (Map.Entry<String, Long> pair : map.entrySet()) {
            if (pair.getValue() > minSize) {
                minSize = pair.getValue();
            }
        }

        for (Map.Entry<String, Long> pair : map.entrySet()) {
            if (pair.getValue().equals(minSize)) {
                byte[] bytes = new byte[10];
                try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(pair.getKey()))) {
                    System.out.println(pair.getKey());
                    System.out.println(new String(bytes, 0, bufferedInputStream.read(bytes)));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void deleteDirectory(File dir) {
        if (!dir.isDirectory()) {
            dir.delete();
        } else {
            String[] children = dir.list();
            for (int i = 0; i < children.length; i++) {
                File f = new File(dir, children[i]);
                deleteDirectory(f);
            }
            dir.delete();
        }
    }
}
