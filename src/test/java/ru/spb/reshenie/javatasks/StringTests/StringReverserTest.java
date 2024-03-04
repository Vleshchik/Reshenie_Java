package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.StringReverser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverserTest {
    @Test
    public void testReverseString() {
        String input = "Hello";
        String expected = "olleH";
        assertEquals(expected, StringReverser.reverseString(input));
    }
}
