package com.mera.kalinina.lesson9.streams;

/*
Задание 2. Фильтрованные атрибуты
Используйте структуру файлов и папок из Задания 1.

- Выведите полное  название и содержимое самого маленького файла. Если таких файлов несколько - выведите их все
- Выведите полное название и первые 10 символов самого большого файла.
- Удалите папку SE2020_LESSON9 и все вложенные файлы и папки.
 */

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) throws IOException {

        Path rootDirName = Paths.get("SE2020_LESSON9").toAbsolutePath();

        FilterFileVisitor filterFileVisitor = new FilterFileVisitor();
        Files.walkFileTree(rootDirName, filterFileVisitor);

        System.out.println(filterFileVisitor.getFileNamesAndSizes());
        System.out.println();

        Long minFileSize = Collections.min(filterFileVisitor.getFileNamesAndSizes().values());
        System.out.println("Files with min size = " + minFileSize + " :");

        for(Map.Entry<String, Long> file : filterFileVisitor.getFileNamesAndSizes().entrySet()) {
            if(file.getValue().equals(minFileSize)) {
                System.out.println("File name: " + file.getKey());
                System.out.print("File content: ");
                FileUtils.printFileContent(file.getKey());
            }
        }

        System.out.println();

        Long maxFileSize = Collections.max(filterFileVisitor.getFileNamesAndSizes().values());
        System.out.println("Files with max size = " + maxFileSize + " :");

        for(Map.Entry<String, Long> file : filterFileVisitor.getFileNamesAndSizes().entrySet()) {
            if(file.getValue().equals(maxFileSize)) {
                System.out.println("File name: " + file.getKey());
                System.out.print("First 10 chars of file content: ");
                byte[] bytes = new byte[10];
                FileUtils.printFirstNCharsFromFile(file.getKey(), bytes);
            }
        }

        FileUtils.deleteDirectory(rootDirName.toString());

    }

}
