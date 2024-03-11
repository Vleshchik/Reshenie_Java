package ru.spb.reshenie.javatasks.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
/*
Разбить текстовый файл на несколько файлов:
- по 10 строк
- по пустым строкам
- по 1Мб, не разрывая строк
 */
public class FileSplitter {
    public void splitByLineCount(String sourceFilePath, String targetDirectoryPath, int linesPerFile) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(sourceFilePath));
        int fileCount = 1;
        for (int i = 0; i < allLines.size(); i += linesPerFile) {
            List<String> subList = allLines.subList(i, Math.min(i + linesPerFile, allLines.size()));
            writeToFile(subList, targetDirectoryPath + "/splitByLineCount_" + fileCount + ".txt");
            fileCount++;
        }
    }

    public void splitByEmptyLines(String sourceFilePath, String targetDirectoryPath) throws IOException {
        List<String> allLines = Files.readAllLines(Paths.get(sourceFilePath));
        List<String> subList = new ArrayList<>();
        int fileCount = 1;
        for (String line : allLines) {
            if (line.trim().isEmpty()) {
                writeToFile(subList, targetDirectoryPath + "/splitByEmptyLines_" + fileCount + ".txt");
                subList.clear();
                fileCount++;
            } else {
                subList.add(line);
            }
        }
        writeToFile(subList, targetDirectoryPath + "/splitByEmptyLines_" + fileCount + ".txt");
    }

    public void splitBySize(String sourceFilePath, String targetDirectoryPath, long maxSize) throws IOException {
        File sourceFile = new File(sourceFilePath);
        long fileSize = sourceFile.length();
        int partCounter = 1;
        int sizeOfFiles = 1024 * 1024; // 1MB
        byte[] buffer = new byte[sizeOfFiles];

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile))) {
            int tmp;
            while ((tmp = bis.read(buffer)) > 0) {
                File newFile = new File(targetDirectoryPath + "/splitBySize_" + partCounter + ".txt");
                try (FileOutputStream out = new FileOutputStream(newFile)) {
                    out.write(buffer, 0, tmp);
                }
                partCounter++;
            }
        }
    }

    private void writeToFile(List<String> lines, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}