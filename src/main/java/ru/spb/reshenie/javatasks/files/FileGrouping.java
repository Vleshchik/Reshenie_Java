package ru.spb.reshenie.javatasks.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
//Разбить файлы в заданной папке на группы по дате создания и упаковать в архивы 20180730.zip, 20180729.zip, ...
public class FileGrouping {
    public void groupAndZipFilesByCreationDate(String sourceDir) {
        File[] files = new File(sourceDir).listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    Date creationDate = new Date(file.lastModified());
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
                    String destFileName = dateFormat.format(creationDate) + ".zip";
                    try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(destFileName));
                         FileInputStream fis = new FileInputStream(file)) {
                        ZipEntry zipEntry = new ZipEntry(file.getName());
                        zos.putNextEntry(zipEntry);
                        byte[] buffer = new byte[1024];
                        int len;
                        while ((len = fis.read(buffer)) > 0) {
                            zos.write(buffer, 0, len);
                        }
                        zos.closeEntry();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}