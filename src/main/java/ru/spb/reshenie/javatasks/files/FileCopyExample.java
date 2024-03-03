package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileCopyExample {
    public static void main(String[] args) throws IOException {
        File sourceDirectory = new File("исходная_папка");
        File targetDirectory = new File("целевая_папка");
        Pattern pattern = Pattern.compile("ваша_регулярка_для_имен_файлов_с_группами");
        File[] filesToCopy = sourceDirectory.listFiles((dir, name) -> pattern.matcher(name).matches());
        if (filesToCopy != null) {
            for (File file : filesToCopy) {
                Matcher matcher = pattern.matcher(file.getName());
                if (matcher.matches()) {
                    String targetFileName = "новое_имя_файла_с_использованием_групп: " + matcher.group(1);
                    Path targetPath = Paths.get(targetDirectory.getAbsolutePath(), targetFileName);
                    Files.copy(file.toPath(), targetPath);
                }
            }
        }
    }
}