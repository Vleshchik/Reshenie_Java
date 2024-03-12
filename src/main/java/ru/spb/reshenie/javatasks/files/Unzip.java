package ru.spb.reshenie.javatasks.files;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.zip.ZipFile;
//Распаковать все архивы из заданной папки (srcDir) и ее подпапок, положить распакованные файлы в отдельную папку (destDir)
public class Unzip {
    public void unzipAll(String srcDir, String destDir) {
        try {
            Files.walk(Paths.get(srcDir))
                    .filter(path -> Files.isRegularFile(path) && path.getFileName().toString().endsWith(".zip"))
                    .forEach(zipFile -> {
                        try (ZipFile file = new ZipFile(zipFile.toFile())) {
                            file.stream()
                                    .forEach(entry -> {
                                        try (InputStream input = file.getInputStream(entry)) {
                                            Path outputPath = Paths.get(destDir, entry.getName());
                                            Files.createDirectories(outputPath.getParent());
                                            Files.copy(input, outputPath, StandardCopyOption.REPLACE_EXISTING);
                                        } catch (IOException ex) {
                                            ex.printStackTrace();
                                        }
                                    });
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    });
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}