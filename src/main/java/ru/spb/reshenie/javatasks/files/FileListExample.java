package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.util.Arrays;

public class FileListExample {
    public static void main(String[] args) {
        File directory = new File("путь_к_папке");
        File[] files = directory.listFiles();
        if (files != null) {
            Arrays.stream(files).forEach(file -> System.out.println(file.getName() + " - " + file.length() + " bytes"));
        }
    }
}