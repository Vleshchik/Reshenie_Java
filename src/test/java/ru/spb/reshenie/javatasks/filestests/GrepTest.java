package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.Grep;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GrepTest {
    @Test
    public void testGrep() throws IOException {
        Grep grep = new Grep();
        String rootDir = "src\\main\\resources\\FileGrouping";
        String searchText = "example";

        File testFile = new File(rootDir + "/testFile.txt");
        testFile.createNewFile();

        Files.write(testFile.toPath(), "This is an example line.".getBytes());

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        grep.grep(rootDir, searchText);

        assertTrue(outputStream.toString().contains("This is an example line."));

        System.setOut(System.out);

        testFile.delete();
    }
}
