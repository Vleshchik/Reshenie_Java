package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileList;
import java.io.File;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FileListTest {
    @Test
    public void showFileListTest() {
        File directory = new File("src\\main\\resources");
        File[] files = directory.listFiles();
        List<String> expectedFileList = new ArrayList<>();
        expectedFileList.add("jdk8u282-full - 289543532 bytes");
        assertEquals(expectedFileList, FileList.showFileList(files));
    }
}
