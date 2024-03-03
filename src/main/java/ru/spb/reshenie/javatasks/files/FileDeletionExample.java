package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.util.regex.Pattern;

public class FileDeletionExample {
    public static void main(String[] args) {
        File directory = new File("путь_к_папке");
        Pattern pattern = Pattern.compile("ваша_регулярка_для_имен_файлов");
        File[] filesToDelete = directory.listFiles((dir, name) -> pattern.matcher(name).matches());
        if (filesToDelete != null) {
            for (File file : filesToDelete) {
                file.delete();
            }
        }
    }
}
