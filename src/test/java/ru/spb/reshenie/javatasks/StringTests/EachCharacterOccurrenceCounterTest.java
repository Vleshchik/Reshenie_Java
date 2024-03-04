package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.EachCharacterOccurrenceCounter;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EachCharacterOccurrenceCounterTest {
    @Test
    public void testCountCharacterFrequency() {
        String input = "hello";

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('h', 1);
        expected.put('e', 1);
        expected.put('l', 2);
        expected.put('o', 1);

        assertEquals(expected, EachCharacterOccurrenceCounter.countCharacterFrequency(input));
    }
}
