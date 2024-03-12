package ru.spb.reshenie.javatasks.files;

import java.io.*;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
/*
Реализовать логгер:
- сообщения должны содержать дату и время с миллисекундами, уровень (INFO/WARNING/ERROR) и текст сообщения
- сообщения пишутся в файл с именем "yyyyMMdd.log"
- когда файлы логов начинают занимать больше 5Мб, упаковывать их в zip с именем <мин.дата файла>-<макс.дата файла>
 */
public class Logger {
    private static final long MAX_FILE_SIZE = 5 * 1024 * 1024; // 5MB in bytes
    private static final String LOG_DIR = "src\\main\\resources\\logs\\";

    public void log(String message, Level level) {
        String logFileName = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log";
        File logFile = new File(LOG_DIR + logFileName);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile, true))) {
            String logMessage = buildLogMessage(message, level);
            writer.write(logMessage);
            writer.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (logFile.length() > MAX_FILE_SIZE) {
            // Архивация лог-файла
            try {
                String zipFileName = LOG_DIR + logFileName.replace(".log", ".zip");
                try (FileOutputStream fos = new FileOutputStream(zipFileName);
                     ZipOutputStream zos = new ZipOutputStream(fos)) {
                    ZipEntry zipEntry = new ZipEntry(logFile.getName());
                    zos.putNextEntry(zipEntry);
                    Files.copy(logFile.toPath(), zos);
                    zos.closeEntry();
                }
                // Удаляем исходный файл после архивации
                logFile.delete();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private String buildLogMessage(String message, Level level) {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
        return String.format("%s %s: %s", formattedDateTime, level, message);
    }
}