package ru.spb.reshenie.javatasks.files;

import java.io.*;

public class FileEncodingExample {
    public static void convertEncoding(String sourceFile, String destFile, String sourceEncoding, String destEncoding) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(sourceFile), sourceEncoding));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(destFile), destEncoding)) {
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