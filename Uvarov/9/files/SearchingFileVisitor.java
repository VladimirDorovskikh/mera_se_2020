package mera.files;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchingFileVisitor extends SimpleFileVisitor<Path> {
    private Map<String, Long> fileSizesValues = new HashMap();

    public Map<String, Long> getFileSizesValues() {
        return fileSizesValues;
    }

    @Override
    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        fileSizesValues.put(file.getParent() + "\\" + file.getFileName(),attrs.size());
        return FileVisitResult.CONTINUE;
    }
}
