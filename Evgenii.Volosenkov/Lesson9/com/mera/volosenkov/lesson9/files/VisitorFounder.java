package com.mera.volosenkov.lesson9.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class VisitorFounder extends SimpleFileVisitor<Path> {
    private List<Path>  files = new ArrayList<>();
    private List<Path> folders = new ArrayList<>();
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException
    {

        folders.add(dir);
        return FileVisitResult.CONTINUE;
    }

    public List<Path> getFolders() {
        return folders;
    }

    public List<Path> getFiles() {
        return files;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException
    {
        files.add(file);
        return FileVisitResult.CONTINUE;
    }
}
