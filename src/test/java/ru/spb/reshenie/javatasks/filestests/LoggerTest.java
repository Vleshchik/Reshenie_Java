package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.Logger;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class LoggerTest {
    @Test
    public void testLogAndArchive() throws IOException {
        Logger logger = new Logger();
        String logMessage = "Test log message";
        Level logLevel = Level.INFO;

        // Создаем временный файл для теста
        File testLogFile = new File("src\\main\\resources\\logs\\" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd")) + ".log");
        testLogFile.createNewFile();

        // Заполняем временный файл данными, чтобы превысить размер
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 500000; i++) {
            sb.append("Test log message. ");
        }
        Files.write(testLogFile.toPath(), sb.toString().getBytes());

        // Вызываем метод log
        logger.log(logMessage, logLevel);

        // Проверяем, что файлы логов архивированы
        File zipLogFile = new File("src\\main\\resources\\logs\\" + testLogFile.getName().replace(".log", ".zip"));
        assertTrue(zipLogFile.exists());

        // Удаляем временные файлы
        testLogFile.delete();
        zipLogFile.delete();
    }
}
