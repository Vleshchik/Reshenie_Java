package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.WordShortener;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordShortenerTest {
    @Test
    public void testShortenWords_singleWord() {
        String input = "Hello";
        String expected = "H-o";
        String result = WordShortener.shortenWords(input);
        assertEquals(expected, result);
    }
    @Test
    public void testShortenWords() {
        String input = "The quick brown fox jumps over the lazy dog";
        String expected = "T-e q-k b-n f-x j-s o-r t-e l-y d-g";
        String result = WordShortener.shortenWords(input);
        assertEquals(expected, result);
    }
}
