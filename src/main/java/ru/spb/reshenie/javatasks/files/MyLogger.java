package ru.spb.reshenie.javatasks.files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger {
    private static final Logger logger = Logger.getLogger("MyLogger");
    private static final String LOG_FOLDER = "logs/";

    static {
        try {
            Files.createDirectories(Paths.get(LOG_FOLDER));
            FileHandler fileHandler = new FileHandler(LOG_FOLDER + new SimpleDateFormat("yyyyMMdd").format(new Date()) + ".log", true);
            fileHandler.setFormatter(new SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void log(Level level, String message) {
        logger.log(level, message);
    }

    public static void zipOldLogs() {
        try {
            Path logDir = Paths.get(LOG_FOLDER);
            Files.walkFileTree(logDir, new SimpleFileVisitor<Path>() {
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.toString().endsWith(".log") && Files.size(file) > 5 * 1024 * 1024) {
                        String zipFileName = file.getParent().toString() + "/" + logDir.toFile().list()[0] + "-" + logDir.toFile().list()[logDir.toFile().list().length - 1] + ".zip";
                        zipFile(file, Paths.get(zipFileName));
                        Files.delete(file);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void zipFile(Path sourceFile, Path zipFile) throws IOException {
        try (FileSystem fs = FileSystems.newFileSystem(zipFile, null)) {
            Path source = fs.getPath(sourceFile.toString());
            Path dest = fs.getPath(sourceFile.getFileName() + ".zip");
            Files.copy(source, dest, StandardCopyOption.REPLACE_EXISTING);
        }
    }
}