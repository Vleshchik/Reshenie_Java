package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.TextIndenter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TextIndenterTest {
    @Test
    public void testIndentText() {
        String input = "Line 1\nLine 2\nLine 3";
        String expected = "    Line 1\n    Line 2\n    Line 3\n";
        assertEquals(expected, TextIndenter.indentText(input));
    }
}
