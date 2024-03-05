package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.LineCountCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LineCountCalculatorTest {
    @Test
    public void testCountLines() {
        String input = "First line\nSecond line\nThird line";

        assertEquals(3, LineCountCalculator.countLines(input));
    }
}
