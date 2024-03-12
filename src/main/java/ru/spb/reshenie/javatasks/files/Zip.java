package ru.spb.reshenie.javatasks.files;

import java.io.*;
import java.nio.file.*;
import java.util.zip.*;
//Распаковать/запаковать zip с логгированием обрабатываемых файлов (путь файла в архиве, куда распакован)
public class Zip {
    public void unpackZip(String zipFilePath, String destDir) {
        try (ZipInputStream zis = new ZipInputStream(new FileInputStream(zipFilePath))) {
            ZipEntry zipEntry;
            while ((zipEntry = zis.getNextEntry()) != null) {
                String filePath = destDir + File.separator + zipEntry.getName();
                logProcessedFile(zipEntry.getName(), filePath);
                if (zipEntry.isDirectory()) {
                    Files.createDirectories(Paths.get(filePath));
                } else {
                    Files.createDirectories(Paths.get(filePath).getParent());
                    try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath))) {
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = zis.read(buffer)) > 0) {
                            bos.write(buffer, 0, len);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void packToZip(String srcDir, String zipFilePath) {
        try (FileOutputStream fos = new FileOutputStream(zipFilePath);
             ZipOutputStream zos = new ZipOutputStream(fos)) {
            Path sourcePath = Paths.get(srcDir);
            Files.walk(sourcePath)
                    .filter(path -> !Files.isDirectory(path))
                    .forEach(path -> {
                        String entryName = sourcePath.relativize(path).toString().replace("\\", "/");
                        ZipEntry zipEntry = new ZipEntry(entryName);
                        try {
                            zos.putNextEntry(zipEntry);
                            Files.copy(path, zos);
                            zos.closeEntry();
                            logProcessedFile(path.toString(), zipEntry.getName());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private void logProcessedFile(String source, String destination) {
        System.out.println("Processed file: " + source + " => " + destination);
    }
}