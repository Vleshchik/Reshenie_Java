package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.SubstringOccurrenceCounter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubstringOccurrenceCounterTest {
    @Test
    public void testCountSubstringInSentence() {
        String input = "Hello, hello, hello";
        String subString = "hello";
        int expected = 3;
        assertEquals(expected, SubstringOccurrenceCounter.countSubstringInSentence(input, subString));
    }
}
