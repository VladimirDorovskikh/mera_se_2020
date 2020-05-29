package com.mera.lesson9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;

public class PathExample {

    public static void main(String[] args) throws IOException {
        final Path vasyaObj = Paths.get("vasya.obj");
        System.out.println(vasyaObj); // vasya.obj
        System.out.println(vasyaObj.toAbsolutePath()); //C:\programming\mera_se_2020\vasya.obj

        System.out.println(vasyaObj.toAbsolutePath().getName(0)); // programming

       // System.out.println(vasyaObj.getParent().getFileName());  NPE
        System.out.println(vasyaObj.toAbsolutePath().getParent().getFileName()); //mera_se_2020
        System.out.println(vasyaObj.toAbsolutePath().getRoot()); //C:\
        System.out.println(vasyaObj.resolve("_LECTIONS").toAbsolutePath());//C:\programming\mera_se_2020\vasya.obj\_LECTIONS


        final BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(vasyaObj, BasicFileAttributeView.class);
        final BasicFileAttributes basicFileAttributes = fileAttributeView.readAttributes();
        final long size = basicFileAttributes.size();
    }
}
