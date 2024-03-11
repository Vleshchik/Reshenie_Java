package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
//Скопировать файлы по маске имени, в целевом пути можно использовать regex группы ($1, $2, ...)
public class FileCopier {
    public int copyFilesByMask(String sourceDirectory, String targetDirectory, String fileMask) throws IOException {
        File sourceDir = new File(sourceDirectory);
        File targetDir = new File(targetDirectory);
        List<String> copiedFiles = new ArrayList<>();
        if (!targetDir.exists()) {
            targetDir.mkdirs();
        }
        File[] files = sourceDir.listFiles();
        if (files != null) {
            Pattern pattern = Pattern.compile(fileMask);
            for (File file : files) {
                if (pattern.matcher(file.getName()).matches()) {
                    copiedFiles.add(targetDir + "\\" + file.getName());
                    File destFile = new File(targetDir + "\\" + file.getName());
                    if (destFile.exists()) {
                        destFile.delete();
                    }
                    Files.copy(file.toPath(), destFile.toPath());
                }
            }
        }
        return copiedFiles.size();
    }
    public static void main(String[] args) throws IOException {
        FileCopier fileCopier = new FileCopier();
        String sourceDirectory = "src\\main\\resources\\FileCopier\\Source";
        String targetDirectory = "src\\main\\resources\\FileCopier\\Target";
        String fileMask = "\\w+_\\d{2}\\.\\d{2}\\.\\d{4}\\.txt";
        System.out.println(fileCopier.copyFilesByMask(sourceDirectory, targetDirectory, fileMask));
    }
}