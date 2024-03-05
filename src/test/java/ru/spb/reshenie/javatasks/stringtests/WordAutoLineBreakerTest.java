package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.WordAutoLineBreaker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordAutoLineBreakerTest {
    @Test
    public void testAutoLineBreak() {
        String input = "This is a sample text for auto line breaking";
        int maxLength = 10;
        String expected = "This is a \nsample tex\nt for auto\n line brea\nking\n";
        assertEquals(expected, WordAutoLineBreaker.autoLineBreak(input, maxLength));
    }
}
