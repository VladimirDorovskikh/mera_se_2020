package com.mera.volosenkov.lesson9.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileManager {
    public static void createDirectory(String path)
    {
        File folder = new File(path);
        if(!folder.mkdirs())
        {
            System.out.println("Cannot create folder "+path);
            return;
        }
        System.out.println("Directory "+ path + " was created");

    }
    public static File createFile(String path) throws IOException {
        File file = new File(path);
        if(file.createNewFile())
        {
            System.out.println("File "+path+" was created succesfully");
            return file;
        }
        else
        {
            System.out.println("File "+path+" was not created");
        }
        return null;
    }
    public static void writeToFile(String filePath, String content) throws IOException {
        FileOutputStream fileStream = new FileOutputStream(filePath);
        fileStream.write(content.getBytes());
        fileStream.close();
    }
    public static String readFromFile(String path) throws IOException {
        StringBuilder resultBuilder = new StringBuilder();

        BufferedInputStream stream = new BufferedInputStream(new FileInputStream(path));
        BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        String fileLine = reader.readLine();
        while(fileLine!=null)
        {
            resultBuilder.append( fileLine + '\n');
            fileLine = reader.readLine();
        }
        reader.close();
        stream.close();
        return resultBuilder.toString();
    }

    public static List<String> getNestedFiles(Path path) throws IOException {
        List<String> result = new ArrayList<>();
        VisitorFounder visitor = new VisitorFounder();
        Files.walkFileTree(path, visitor);
        for( Path file:visitor.getFiles())
        {
            result.add(file.toString());
        }
        return result;
    }

    private static void recursiveDeleteFolders(Path root)
    {
        File rootDir = new File(root.toString());
        String[] children = rootDir.list();
        if(children.length!=0)
        {
            for(String child:children)
            {
                recursiveDeleteFolders(Paths.get(root.toString(), child));
            }
        }
        rootDir.delete();
    }
    public static void deletePath(Path path) throws IOException {
        VisitorFounder visitor = new VisitorFounder();
        Files.walkFileTree(path, visitor);
        List<Path> files = visitor.getFiles();
        List<Path> folders = visitor.getFolders();
        for(Path filePath:files)
        {
            File file = new File(filePath.toString());
            file.delete();
        }
        recursiveDeleteFolders(path);
    }
}
