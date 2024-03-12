package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import ru.spb.reshenie.javatasks.files.Zip;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class ZipTest {
    @Test
    public void testUnpackZip() throws IOException {
        String zipFilePath = "src\\main\\resources\\source\\testZip.zip"; // Предположим, что у нас есть тестовый архив test.zip
        String destDir = "src\\main\\resources\\destination"; // Используем временную директорию для распаковки

        Zip zip = new Zip();
        zip.unpackZip(zipFilePath, destDir);

        // Проверяем, что файлы были успешно распакованы
        File destDirectory = new File(destDir);
        assertTrue(destDirectory.exists());

        // Проверяем наличие распакованных файлов
        File unpackedFile = new File(destDir + File.separator + "testZip.txt");
        assertTrue(unpackedFile.exists());
    }

    @Test
    public void testPackToZip() throws IOException {
        String srcDir = "src\\main\\resources\\source\\testZip.txt"; // Предположим, что у нас есть тестовая директория с файлами
        String zipFilePath = "src\\main\\resources\\destination\\packed.zip"; // Используем временный файл для упаковки

        Zip zip = new Zip();
        zip.packToZip(srcDir, zipFilePath);

        // Проверяем, что архив был успешно создан
        File packedFile = new File(zipFilePath);
        assertTrue(packedFile.exists());

        // Проверяем содержимое архива
        try (ZipFile zipFile = new ZipFile(zipFilePath)) {
            ZipEntry entry = zipFile.getEntry("packed.zip");
            assertTrue(entry != null);
        }
    }
}
