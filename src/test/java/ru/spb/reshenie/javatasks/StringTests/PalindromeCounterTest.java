package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.PalindromeCounter;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PalindromeCounterTest {
    @Test
    public void testFindPalindromes() {
        String input = "level radar apple deed";
        List<String> expected = Arrays.asList("level", "radar", "deed");

        assertEquals(expected, PalindromeCounter.findPalindromes(input));
    }
}
