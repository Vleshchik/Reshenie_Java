package ru.spb.reshenie.javatasks.filestests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import ru.spb.reshenie.javatasks.files.SerializableMap;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class SerializableMapTest {
    @Test
    public void testLoadAndSave(@TempDir Path tempDir) throws IOException {
        File file = new File(tempDir.toFile(), "testMap.txt");
        SerializableMap serializableMap = new SerializableMap(file);


        serializableMap.put("key1", "value1");
        serializableMap.put("key2", "value2");
        serializableMap.save();

        File savedFile = new File(tempDir.toFile(), "testMap.txt");
        assertEquals(true, savedFile.exists());


        SerializableMap loadedMap = new SerializableMap(savedFile);
        loadedMap.load();


        assertEquals("value1", loadedMap.get("key1"));
        assertEquals("value2", loadedMap.get("key2"));
    }
}
