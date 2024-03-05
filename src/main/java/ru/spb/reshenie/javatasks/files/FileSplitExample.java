package ru.spb.reshenie.javatasks.files;

import java.io.*;


public class FileSplitExample {/*
    public static void splitByTenLines(String[] args) throws Exception {
        String inputFile = "input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int lineCount = 1;
            String line;
            PrintWriter writer = new PrintWriter(new FileWriter("output_1.txt"));
            while ((line = reader.readLine()) != null) {
                writer.println(line);
                if (lineCount % 10 == 0) {
                    writer.close();
                    writer = new PrintWriter(new FileWriter("output_" + (lineCount / 10 + 1) + ".txt"));
                }
                lineCount++;
            }
            writer.close();
        }
    }
    public static void splitByEmptyLines(String[] args) throws Exception {
        String inputFile = "input.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int fileCount = 1;
            String line;
            PrintWriter writer = new PrintWriter(new FileWriter("output_1.txt"));
            while ((line = reader.readLine()) != null) {
                writer.println(line);
                if (line.trim().isEmpty()) {
                    writer.close();
                    writer = new PrintWriter(new FileWriter("output_" + (fileCount + 1) + ".txt"));
                    fileCount++;
                }
            }
            writer.close();
        }
    }
    public static void splitByOneMb(String[] args) throws IOException {
        String inputFile = "input.txt";
        int fileSize = 1024 * 1024; // 1MB
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile)) {
            int fileCount = 1;
            String line;
            PrintWriter writer = new PrintWriter(new FileWriter("output_1.txt"));
            int currentSize = 0;
            while ((line = reader.readLine()) != null) {
                writer.println(line);
                currentSize += line.length();
                if (currentSize >= fileSize) {
                    writer.close();
                    writer = new PrintWriter(new FileWriter("output_" + (fileCount + 1) + ".txt"));
                    fileCount++;
                    currentSize = 0;
                }
            }
            writer.close();
        }
    }*/
}