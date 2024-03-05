package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.MapParser;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MapParserTest {
    @Test
    public void testParseMap() {
        String input = "key1=value1,key2=value2,key3=value3";
        Map<String, String> expected = new HashMap<>();
        expected.put("key1", "value1");
        expected.put("key2", "value2");
        expected.put("key3", "value3");
        Map<String, String> result = MapParser.parseMap(input);
        assertEquals(expected, result);
    }
}
