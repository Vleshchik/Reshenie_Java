package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.ExternalProcess;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExternalProcessTest {
    @Test
    public void testRunBatchFile() {
        ExternalProcess externalProcess = new ExternalProcess();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        externalProcess.runBatchFile("C:\\nlab\\nlab-client\\nlab-client.bat");
        assertEquals("", outContent.toString().trim());
    }

    @Test
    public void testOpenFolderInExplorer() {
        ExternalProcess externalProcess = new ExternalProcess();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        externalProcess.openFolderInExplorer("src\\main\\resources");
        assertEquals("", outContent.toString().trim());
    }

    @Test
    public void testOpenInChrome() {
        ExternalProcess externalProcess = new ExternalProcess();
        final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        externalProcess.openInChrome("https://www.google.com");
        assertEquals("", outContent.toString().trim());
    }
}
