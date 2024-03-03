package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.nio.file.Files;
import java.util.stream.Stream;

public class FolderStatsExample {
    public static void main(String[] args) throws Exception {
        File directory = new File("путь_к_папке");
        long size = Files.walk(directory.toPath())
                .mapToLong(path -> path.toFile().length())
                .sum();
        long filesCount = Files.walk(directory.toPath())
                .filter(Files::isRegularFile)
                .count();
        long foldersCount = Files.walk(directory.toPath())
                .filter(Files::isDirectory)
                .count();
        int maxDepth = Files.walk(directory.toPath())
                .map(path -> directory.toPath().relativize(path).getNameCount() - 1)
                .max(Integer::compare)
                .orElse(0);
        System.out.println("Size: " + size + " bytes, Files: " + filesCount + ", Folders: " + foldersCount + ", Max Depth: " + maxDepth);
    }
}