package com.mera.kalinina.lesson9.streams;

/*
адание 1. Файловый произвол
- Создате новую папку с названием SE2020_LESSON9 в любом месте
- Создайте от 1 до 3 (произвольное число) вложенных папок. Название папки - Directory_<уровень вложенности>

Пример, какие папки могут получится
SE2020_LESSON9/1 - если создалась всего одна папка
SE2020_LESSON9/1/2- если создались две папки.
SE2020_LESSON9/1/2/3 - если создались все три папки.
Обратите внимание, что папка 3 - вложена в папку 2, а папка 2 - в папку 1.

- В каждой папке (включая корень SE2020_LESSON9) создайте 1-3 файла:
    содержимое каждого файла - 10-200 случайных цифр (цифр, а не чисел).
    название файла - File_<номер файла, начиная с 1>

- выведите на экран полный путь до всех файлов  (но не папок, вложенные файлы тоже считаются)) в папке SE2020_LESSON9
Совет: Для обхода можно использовать Files.walkFileTree
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task1 {

    public static void main(String[] args) throws IOException {

        Path rootDirName = Paths.get("SE2020_LESSON9").toAbsolutePath();
        FileUtils.createDirectory(rootDirName.toString());

        int dirsNestingDepth = Utils.getRandomIntFromInterval(1,3);
        FileUtils.createSerialNestedDirectories(rootDirName.toString(), dirsNestingDepth);

        FileUtils.createSerialFiles(rootDirName.toString(), 1, 3);

        System.out.println("\nPaths of created files: ");
        Files.walkFileTree(rootDirName, new MyFileVisitor());
    }
}
