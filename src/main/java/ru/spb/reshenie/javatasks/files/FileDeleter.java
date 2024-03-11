package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.util.regex.Pattern;

public class FileDeleter {
    public String deleteFilesByPattern(String directoryPath, String regex) {
        StringBuilder result = new StringBuilder();
        File directory = new File(directoryPath);
        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                Pattern pattern = Pattern.compile(regex);
                for (File file : files) {
                    if (pattern.matcher(file.getName()).matches()) {
                        if (file.delete()) {
                            result.append("Файл ").append(file.getName()).append(" удален\n");
                        } else {
                            result.append("Не удалось удалить файл ").append(file.getName()).append("\n");
                        }
                    }
                }
            } else {
                result.append("Директория пуста или не существует\n");
            }
        } else {
            result.append("Указанная директория не существует\n");
        }
        return result.toString();
    }
}
