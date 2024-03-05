package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.RussianTransliterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RussianTransliteratorTest {
    @Test
    public void testTransliterate() {
        String input = "Привет, мир!";
        String expected = "Privet, mir!";
        assertEquals(expected, RussianTransliterator.transliterate(input));
    }
}
