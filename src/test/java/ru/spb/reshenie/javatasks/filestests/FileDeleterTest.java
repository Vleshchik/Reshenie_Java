package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileDeleter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileDeleterTest {
    @Test
    public void testDeleteFilesByPattern() {
        FileDeleter fileDeleter = new FileDeleter();
        String directoryPath = "src\\main\\resources\\dlt";
        String regex = "w+_\\d{2}\\.\\d{2}\\.\\d{4}";
        String expectedResult = "Указанная директория не существует\n";
        String actualResult = fileDeleter.deleteFilesByPattern(directoryPath, regex);
        assertEquals(expectedResult, actualResult);
    }
}