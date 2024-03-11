package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.util.*;
//Вывести дерево файлов с корнем в заданной папке
public class FileTree {
    public List<String> listFiles(File directory, int depth) {
        List<String> filesList = new ArrayList<>();
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                String tb = "";
                for (int i = 0; i < depth; i++) {
                    tb += "\t";
                }
                filesList.add(tb + file.getName());
                if (file.isDirectory()) {
                    filesList.addAll(listFiles(file, depth + 1));
                }
            }
        }
        return filesList;
    }
}
