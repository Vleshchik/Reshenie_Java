package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileGrouping;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FileGroupingTest {
    @Test
    public void testGroupAndZipFilesByCreationDate() throws IOException {
        FileGrouping fileGroupingExample = new FileGrouping();
        String sourceDir = "src\\main\\resources\\FileGrouping";

        File testFile = new File(sourceDir + "/testFile.txt");
        testFile.createNewFile();

        fileGroupingExample.groupAndZipFilesByCreationDate(sourceDir);

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        String currentDateString = dateFormat.format(new Date());


        String expectedZipFileName = currentDateString + ".zip";

        File zipFile = new File(expectedZipFileName);
        assertTrue(zipFile.exists());

        testFile.delete();
        zipFile.delete();
    }
}
