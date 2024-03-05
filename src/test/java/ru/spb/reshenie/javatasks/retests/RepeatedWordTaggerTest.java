package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.RepeatedWordTagger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedWordTaggerTest {
    @Test
    public void testHighlightDuplicateWords_noRepeatedWords() {
        String input = "This is a test sentence without any repeated words";
        String expected = "This is a test sentence without any repeated words";
        String result = RepeatedWordTagger.highlightDuplicateWords(input);
        assertEquals(expected, result);
    }

    @Test
    public void testHighlightDuplicateWords_oneRepeatedWord() {
        String input = "This is a test test sentence with one repeated word";
        String expected = "This is a test <strong>test</strong> sentence with one repeated word";
        String result = RepeatedWordTagger.highlightDuplicateWords(input);
        assertEquals(expected, result);
    }
}
