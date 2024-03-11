package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileSplitter;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
public class FileSplitterTest {
    @Test
    public void testSplitByLineCount() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        String sourceFilePath = "src\\main\\resources\\FileSplitter\\Onegin_Chapter_one.txt";
        String targetDirectoryPath = "src\\main\\resources\\FileSplitter\\ByLineCount";
        int linesPerFile = 10;
        fileSplitter.splitByLineCount(sourceFilePath, targetDirectoryPath, linesPerFile);
        for (int i = 1; i <= 10; i++) {
            File file = new File(targetDirectoryPath + "/splitByLineCount_" + i + ".txt");
            assertTrue(file.exists());
        }
    }
    @Test
    public void testSplitByEmptyLines() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        String sourceFilePath = "src\\main\\resources\\FileSplitter\\Onegin_Chapter_one.txt";
        String targetDirectoryPath = "src\\main\\resources\\FileSplitter\\ByEmptyLines";
        fileSplitter.splitByEmptyLines(sourceFilePath, targetDirectoryPath);
        assertTrue(Files.exists(Paths.get(targetDirectoryPath + "/splitByEmptyLines_1.txt")));
    }
    @Test
    public void testSplitBySize() throws IOException {
        FileSplitter fileSplitter = new FileSplitter();
        String sourceFilePath = "src\\main\\resources\\FileSplitter\\Onegin_Chapter_one.txt";
        String targetDirectoryPath = "src\\main\\resources\\FileSplitter\\BySize";
        long maxSize = 1024 * 1024; // 1MB
        fileSplitter.splitBySize(sourceFilePath, targetDirectoryPath, maxSize);
        File file = new File(targetDirectoryPath + "/splitBySize_1.txt");
        assertTrue(file.exists());
    }
}