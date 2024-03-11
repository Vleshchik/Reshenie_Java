package ru.spb.reshenie.javatasks.files;

import java.io.File;

public class FileTree {
    public static void main(String[] args) {
        File directory = new File("src\\main\\resources\\FileList");
        listFiles(directory, 0);
    }

    public static void listFiles(File directory, int depth) {
        if (directory.isDirectory()) {
            for (File file : directory.listFiles()) {
                for (int i = 0; i < depth; i++) {
                    System.out.print("\t");
                }
                System.out.println(file.getName());
                if (file.isDirectory()) {
                    listFiles(file, depth + 1);
                }
            }
        }
    }
}
