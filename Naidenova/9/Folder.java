import java.nio.file.*;
import java.util.Random;
import java.io.*;

public class Folder {

    public static void main(String[] args) throws IOException {
        //Создате новую папку с названием SE2020_LESSON9, вложенные папки и файлы
        String root = "SE2020_LESSON9";
        int randomSubfoldersNumber = new Random().nextInt(3)+1;
        Folder.createDir(root, randomSubfoldersNumber);

        //выведите на экран полный путь до всех файлов
        Path path = Paths.get(Paths.get("").toAbsolutePath().toString());
        Files.walkFileTree(path, (FileVisitor<? super Path>) new MyFileVisitor());

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

       FileOutputStream outputStream = new FileOutputStream(fileName);
       int digitsNumber = new Random().nextInt(190)+10;         //10-200 случайных цифр
       for (int i=0; i<digitsNumber; i++){
           int digit = new Random().nextInt(9);               //случайные цифры
           outputStream.write(String.valueOf(digit+"\n").getBytes());
       }
   }

}
