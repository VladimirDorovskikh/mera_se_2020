package com.katepopkova;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

import static java.nio.file.FileVisitResult.CONTINUE;

public class FileVisitor extends SimpleFileVisitor {

    @Override
    public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) {
        if(attrs.isRegularFile()) {
            System.out.println(file);
        }
        return CONTINUE;
    }

    @Override
    public FileVisitResult visitFileFailed(Object file, IOException exc) {
        System.out.println(exc);
        return CONTINUE;
    }
}