package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.RandomStringGenerator;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomStringGeneratorTest {
    @Test
    public void testGenerateString() {
        int length = 10;
        String result = RandomStringGenerator.generateString(length);

        assertEquals(length, result.length());

        // Check if the generated string contains only valid characters
        HashSet<Character> validCharacters = new HashSet<>();
        for (char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray()) {
            validCharacters.add(c);
        }

        for (char c : result.toCharArray()) {
            assertTrue(validCharacters.contains(c));
        }
    }
}
