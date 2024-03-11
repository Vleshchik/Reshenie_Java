package ru.spb.reshenie.javatasks.files;
//Посчитать размер папки, количество вложенных файлов, папок и максимальный уровень вложенности
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class DirectoryInfo {
    public String printDirectoryInfo(String directoryPath) throws IOException {
        File directory = new File(directoryPath);
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
        return "Size: " + size + " bytes, Files: " + filesCount + ", Folders: " + foldersCount + ", Max Depth: " + maxDepth;
    }
}