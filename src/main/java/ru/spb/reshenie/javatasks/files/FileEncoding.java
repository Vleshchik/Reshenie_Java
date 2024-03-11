package ru.spb.reshenie.javatasks.files;

import java.io.*;

public class FileEncoding {
    public void convertFileEncoding(String sourceFilePath, String targetFilePath) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFilePath), "UTF-8"));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(targetFilePath), "windows-1251"))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}