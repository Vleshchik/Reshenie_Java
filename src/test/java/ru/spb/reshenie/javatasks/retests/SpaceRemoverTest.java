package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.SpaceRemover;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SpaceRemoverTest {
    @Test
    public void testRemoveExtraSpaces_noExtraSpaces() {
        String input = "This is a test sentence without extra spaces";
        String expected = "This is a test sentence without extra spaces";
        String result = SpaceRemover.removeExtraSpaces(input);
        assertEquals(expected, result);
    }

    @Test
    public void testRemoveExtraSpaces_withExtraSpaces() {
        String input = "This   is  a   test   sentence   with   extra   spaces";
        String expected = "This is a test sentence with extra spaces";
        String result = SpaceRemover.removeExtraSpaces(input);
        assertEquals(expected, result);
    }
}
