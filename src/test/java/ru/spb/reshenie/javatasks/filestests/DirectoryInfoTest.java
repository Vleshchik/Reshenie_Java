package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import java.io.IOException;
import ru.spb.reshenie.javatasks.files.DirectoryInfo;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DirectoryInfoTest {
   @Test
   public void testPrintDirectoryInfo() throws IOException {
       DirectoryInfo directoryInfo = new DirectoryInfo();
       String directoryPath = "src\\main\\resources\\FileList";
       final String expectedOutput = "Size: 289916268 bytes, Files: 706, Folders: 168, Max Depth: 11";
       assertEquals(expectedOutput, directoryInfo.printDirectoryInfo(directoryPath));
   }
}
