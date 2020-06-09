package com.mera.volosenkov.lesson9.files;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class VisitorChecker extends SimpleFileVisitor<Path> {
    private long minSize = Long.MAX_VALUE;
    private long maxSize = 0;
    private List<String> filePathsWithMinSize = new ArrayList<>();
    private List<String> filePathsWithMaxSize = new ArrayList<>();
    @Override
    public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
            throws IOException
    {
        return FileVisitResult.CONTINUE;
    }


    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs)
            throws IOException
    {
        long sizeInBytes = attrs.size();
        if(sizeInBytes == minSize )
        {
            filePathsWithMinSize.add(file.toString());
        }

        if(sizeInBytes == maxSize )
        {
            filePathsWithMaxSize.add(file.toString());
        }

        if(sizeInBytes<minSize)
        {
            minSize = sizeInBytes;
            filePathsWithMinSize.clear();;
            filePathsWithMinSize.add(file.toString());
        }

        if(sizeInBytes>maxSize)
        {
            maxSize = sizeInBytes;
            filePathsWithMaxSize.clear();;
            filePathsWithMaxSize.add(file.toString());
        }

        return FileVisitResult.CONTINUE;
    }

    public long getMinSize() {
        return minSize;
    }

    public long getMaxSize() {
        return maxSize;
    }

    public List<String> getFilePathsWithMinSize() {
        return filePathsWithMinSize;
    }

    public List<String> getFilePathsWithMaxSize() {
        return filePathsWithMaxSize;
    }
}
