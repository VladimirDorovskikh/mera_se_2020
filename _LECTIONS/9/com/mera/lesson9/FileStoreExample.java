package com.mera.lesson9;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileStoreExample {
    public static void main(String[] args) throws IOException {
        final Path path = Paths.get(".");
        final FileStore fileStore = Files.getFileStore(path);

        System.out.println(fileStore.getTotalSpace());
        System.out.println(fileStore.getUnallocatedSpace());

        final Iterable<FileStore> fileStores = FileSystems.getDefault().getFileStores();
    }
}
