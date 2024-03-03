package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipExample {
    public static void unzipAllFiles(String srcDir, String destDir) {
        File srcFolder = new File(srcDir);
        File destFolder = new File(destDir);

        if (!destFolder.exists()) {
            destFolder.mkdirs();
        }

        for (File file : srcFolder.listFiles()) {
            if (file.isDirectory()) {
                unzipAllFiles(file.getAbsolutePath(), destDir);
            } else {
                try (ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file))) {
                    ZipEntry entry = zipInputStream.getNextEntry();
                    while (entry != null) {
                        String filePath = destDir + File.separator + entry.getName();
                        if (!entry.isDirectory()) {
                            extractFile(zipInputStream, filePath);
                        } else {
                            File dir = new File(filePath);
                            dir.mkdirs();
                        }
                        zipInputStream.closeEntry();
                        entry = zipInputStream.getNextEntry();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        byte[] buffer = new byte[1024];
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            int len;
            while ((len = zipIn.read(buffer)) > 0) {
                fos.write(buffer, 0, len);
            }
        }
    }
}