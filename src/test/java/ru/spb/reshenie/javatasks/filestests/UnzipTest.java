package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.*;
import ru.spb.reshenie.javatasks.files.Unzip;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.*;
public class UnzipTest {
    private Unzip unzip;
    @BeforeEach
    void setUp() {
        unzip = new Unzip();
    }
    @Test
    void testUnzipAll() {
        String srcDir = "src\\main\\resources\\source";
        String destDir = "src\\main\\resources\\destination";
        unzip.unzipAll(srcDir, destDir);
        assertTrue(Files.exists(Paths.get("src\\main\\resources\\destination\\test.txt")));
    }

}
