package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.MostFrequentCharacterFinder;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MostFrequentCharacterFinderTest {
    @Test
    public void testCountMaxCharacterFrequency() {
        String input = "apple";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('p', 2);

        assertEquals(expected, MostFrequentCharacterFinder.countMaxCharacterFrequency(input));
    }
}
