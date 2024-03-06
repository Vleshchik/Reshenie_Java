package ru.spb.reshenie.javatasks.files;
//Вывести список файлов в заданной папке с их размерами
import java.io.File;
import java.util.*;


public class FileList {
    public static List<String> showFileList(File[] files) {
        List<String> fileList = new ArrayList<>();
        for (File file : files) {
            if (file.isFile())
                fileList.add(file.getName() + " - " + file.length() + " bytes");
            else
                fileList.add(file.getName() + " - " + folderSize(file) + " bytes");
        }
        return fileList;
    }
    public static long folderSize(File directory) {
        long length = 0;
        for (File file : directory.listFiles()) {
            if (file.isFile())
                length += file.length();
            else
                length += folderSize(file);
        }
        return length;
    }
}