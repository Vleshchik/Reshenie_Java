package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.FileCopier;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FileCopierTest {

    @Test
    public void testCopyFilesByMask() throws IOException {
        FileCopier fileCopier = new FileCopier();
        String sourceDirectory = "src\\main\\resources\\FileCopier\\Source";
        String targetDirectory = "src\\main\\resources\\FileCopier\\Target";
        String fileMask = "\\w+_\\d{2}\\.\\d{2}\\.\\d{4}\\.txt";
        assertEquals(1, fileCopier.copyFilesByMask(sourceDirectory, targetDirectory, fileMask));
    }
}
