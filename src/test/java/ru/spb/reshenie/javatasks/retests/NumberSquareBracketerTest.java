package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.NumberSquareBracketer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberSquareBracketerTest {
    @Test
    public void testWrapNumbersInSquareBrackets() {
        String input = "123";
        String result = NumberSquareBracketer.wrapNumbersInSquareBrackets(input);
        assertEquals("[123]", result);
    }
}
