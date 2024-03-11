package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileTree;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileTreeTest {
    @Test
    public void testListFiles() {
        FileTree fileTree = new FileTree();
        File directory = new File("src\\main\\resources\\FileList");
        List<String> expectedFilesList = fileTree.listFiles(directory, 0);
        File testFile = new File("src\\main\\resources\\FileTree.txt");
        try {
            List<String> fileLines = Files.readAllLines(testFile.toPath());
            List<String> actualFilesList = new ArrayList<>();
            for (String line : fileLines) {
                actualFilesList.add(line);
            }
            assertEquals(expectedFilesList, actualFilesList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
