package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.SentenceFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SentenceFormatterTest {
    @Test
    public void testIndentSentences() {
        String input = "This is a sentence. This is another one! And a third?";
        String expected = "    This is a sentence.\n    This is another one!\n    And a third?";
        assertEquals(expected, SentenceFormatter.indentSentences(input));
    }
}
