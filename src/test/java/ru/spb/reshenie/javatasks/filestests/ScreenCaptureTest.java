package ru.spb.reshenie.javatasks.filestests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.files.ScreenCapture;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ScreenCaptureTest {

    @Test
    public void testCaptureScreen() {
        String filePath = "src\\main\\resources\\screenshot.png";
        ScreenCapture.captureScreen(filePath);
        File file = new File(filePath);
        assertTrue(file.exists());
    }
}
