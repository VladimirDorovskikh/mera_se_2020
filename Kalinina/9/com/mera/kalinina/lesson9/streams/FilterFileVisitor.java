package com.mera.kalinina.lesson9.streams;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class FilterFileVisitor extends SimpleFileVisitor<Path> {

    private Map<String, Long> fileNamesAndSizes = new HashMap<>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
        fileNamesAndSizes.put(file.toAbsolutePath().toString(), attrs.size());
        return FileVisitResult.CONTINUE;
    }

    public Map<String, Long> getFileNamesAndSizes() {
        return fileNamesAndSizes;
    }

}
