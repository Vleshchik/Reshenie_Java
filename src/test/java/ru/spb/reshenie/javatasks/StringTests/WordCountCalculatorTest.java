package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.WordCountCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCountCalculatorTest {
    @Test
    public void testCountWordsInSentence() {
        String input = "The quick brown fox jumps over the lazy dog";
        int expected = 9;
        assertEquals(expected, WordCountCalculator.countWordsInSentence(input));
    }
}
