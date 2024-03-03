package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class GrepExample {
    public static void grep(String rootDir, String searchText) {
        try {
            Files.walk(new File(rootDir).toPath())
                    .filter(Files::isRegularFile)
                    .forEach(file -> {
                        try {
                            List<String> matchedLines = Files.lines(file)
                                    .filter(line -> line.contains(searchText))
                                    .collect(Collectors.toList());
                            if (!matchedLines.isEmpty()) {
                                System.out.println("File: " + file.toAbsolutePath());
                                for (int i = 0; i < matchedLines.size(); i++) {
                                    System.out.println("Line " + (i + 1) + ": " + matchedLines.get(i));
                                }
                            }
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}