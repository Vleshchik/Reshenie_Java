package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.TextFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextFormatterTest {
    @Test
    public void testConvertTextFormatting() {
        String input = "This is a **test** *sentence* with **formatting**";
        String expected = "This is a <b>test</b> <i>sentence</i> with <b>formatting</b>";
        String result = TextFormatter.convertTextFormatting(input);
        assertEquals(expected, result);
    }
}
