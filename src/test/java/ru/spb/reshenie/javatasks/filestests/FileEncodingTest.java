package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileEncoding;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileEncodingTest {
    @Test
    public void testConvertFileEncoding() {
        String sourceFilePath = "src\\main\\resources\\FileEncoding\\sourceFile.txt";
        String targetFilePath = "src\\main\\resources\\FileEncoding\\targetFile.txt";

        FileEncoding fileEncoding = new FileEncoding();
        fileEncoding.convertFileEncoding(sourceFilePath, targetFilePath);

        String expectedContent = "Hello world\n";

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(targetFilePath), "windows-1251"))) {
            StringBuilder actualContent = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                actualContent.append(line).append("\n");
            }
            assertEquals(expectedContent, actualContent.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
