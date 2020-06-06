
import java.io.File;
import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.HashMap;
import java.util.Map;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
    String partOfName = "File_";
    public static Map<File, Long> foundFiles = new HashMap<File, Long>();

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

        boolean containsName = true;
        if (partOfName != null && !file.getFileName().toString().contains(partOfName))
            containsName = false;
        else {
            System.out.println(file.getParent() + "\\" + file.getFileName());
            File f = new File(file.getParent() + "\\" + file.getFileName());
            System.out.println(getFileSize(f)+" bytes");
            foundFiles.put(f, getFileSize(f));
        }

        return FileVisitResult.CONTINUE;
    }

    public static Map<File, Long> getFoundFiles() {
        return foundFiles;
    }

    private static Long getFileSize(File file){
        return file.length();
    }
}
