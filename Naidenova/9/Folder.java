import java.nio.file.*;
import java.util.*;
import java.io.*;

public class Folder {

    public static void main(String[] args) throws IOException {
        //Создате новую папку с названием SE2020_LESSON9, вложенные папки и файлы.
        String root = "SE2020_LESSON9";
        int randomSubfoldersNumber = new Random().nextInt(3)+1;
        createDir(root, randomSubfoldersNumber);

        //выведите на экран полный путь до всех файлов
        MyFileVisitor myFileVisitor = new MyFileVisitor();
        Path path = Paths.get("").toAbsolutePath();
        Files.walkFileTree(path, (FileVisitor<? super Path>) new MyFileVisitor());

        //Выведите полное  название и содержимое самого маленького файла.
        Map<File, Long> foundFiles = myFileVisitor.getFoundFiles();
        findFileMinSize(foundFiles);

        //Выведите полное название и первые 10 символов самого большого файла.
        findFileMaxSize(foundFiles);

        //Удалите папку SE2020_LESSON9 и все вложенные файлы и папки.
        Path pathToDelete = Paths.get(Paths.get("").toAbsolutePath() + "\\"+ root);
        deleteDirectory(pathToDelete.toFile());
    }

    public static void createDir(String root, int subfoldersNumber) throws IOException {

        System.out.println("Create SE2020_LESSON9 folder with "+ subfoldersNumber + " subfolders");
        String[] pathNames = {root, root+"\\Directory_1", root+"\\Directory_1\\Directory_2", root+"\\Directory_1\\Directory_2\\Directory_3"};
        for (int i=0; i<subfoldersNumber+1; i++) {
            String pathName = pathNames[i];
            createSubFolders(pathName);
        }
        System.out.println("SE2020_LESSON9 created");
    }



    private static void createSubFolders(String pathName) throws IOException {

        File theDir = new File(pathName);
        theDir.mkdirs();
        int randomFilesNUmber = new Random().nextInt(2);
        if (randomFilesNUmber == 0) {
            createFile(theDir + "\\File_1.txt");
        }
        else if (randomFilesNUmber == 1) {
            createFile(theDir + "\\File_1.txt");
            createFile(theDir + "\\File_2.txt");

        }
        else {
            createFile(theDir + "\\File_1.txt");
            createFile(theDir + "\\File_2.txt");
            createFile(theDir + "\\File_3.txt");
        }
    }
    public static void createFile(String dirFile) throws IOException {

        String fileName = dirFile;
        FileWriter fileFile = new FileWriter(fileName);
        writeToFile(fileName);
    }

    public static void writeToFile(String fileName) throws IOException {
        FileOutputStream outputStream = null;
        outputStream = new FileOutputStream(fileName);
        try {
            int digitsNumber = new Random().nextInt(190) + 10;         //10-200 случайных цифр
            for (int i = 0; i < digitsNumber; i++) {
                int digit = new Random().nextInt(9);                    //случайные цифры
                byte[] buffer = String.valueOf(digit + "\n").getBytes();
                outputStream.write(buffer);
            }
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            outputStream.flush();
            outputStream.close();
        }

    }

    public static void findFileMinSize(Map<File, Long> f) throws IOException{
        long minSize = 500;
        for (Map.Entry<File, Long> fileAndSize: f.entrySet()){
            if (fileAndSize.getValue() < minSize){
                minSize = fileAndSize.getValue();
            }
        }
        for (Map.Entry<File, Long> fileAndSize: f.entrySet()) {
            if (fileAndSize.getValue() == minSize) {
                System.out.println("File with min size: \n" + fileAndSize.getKey() + " : " + fileAndSize.getValue() + " bytes");

                try {FileReader fread = new FileReader(fileAndSize.getKey());
                    BufferedReader fin = new BufferedReader(fread);

                    String line;
                    while ((line = fin.readLine()) != null) {
                        System.out.println(line);

                    }
                    fread.close();
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void findFileMaxSize(Map<File, Long> f) throws IOException{
        long maxSize = 1;
        for (Map.Entry<File, Long> fileAndSize: f.entrySet()){
            if (fileAndSize.getValue() > maxSize){
                maxSize = fileAndSize.getValue();
            }
        }
        for (Map.Entry<File, Long> fileAndSize: f.entrySet()) {
            if (fileAndSize.getValue() == maxSize) {
                System.out.println("File with max size: \n" + fileAndSize.getKey() + " : " + fileAndSize.getValue() + " bytes");
                FileReader fread = new FileReader(fileAndSize.getKey());
                BufferedReader fin = new BufferedReader(new FileReader(fileAndSize.getKey()));

                try {String line;
                    int count = 0;
                    while ((line = fin.readLine()) != null) {
                        System.out.println(line);
                        count++;
                        if (count == 10) {
                            break;
                        }
                    }
                    fread.close();
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void deleteDirectory(File pathToDelete){
        if (!pathToDelete.isDirectory()) {
            System.out.println("Trying to delete  " + pathToDelete.getName());
            pathToDelete.delete();
        } else {
            String[] subFolders = pathToDelete.list();
            for (int i = 0; i < subFolders.length; i++) {
                File file = new File(pathToDelete, subFolders[i]);
                deleteDirectory(file);
                if (file.exists()) {
                    System.out.println("Not deleted  " + pathToDelete.toString());
                }
            }
            System.out.println("Trying to delete  " + pathToDelete.getName());
            pathToDelete.delete();
            if (pathToDelete.exists()) {
                System.out.println("Not deleted  " + pathToDelete.toString());
            }
        }
    }
}

