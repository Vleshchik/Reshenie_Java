package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.WordOccurrenceCounter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordOccurrenceCounterTest {
    @Test
    public void testCountWordFrequency() {
        String input = "apple banana apple orange banana apple";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        expected.put("banana", 2);
        expected.put("orange", 1);
        assertEquals(expected, WordOccurrenceCounter.countWordFrequency(input));
    }
}
