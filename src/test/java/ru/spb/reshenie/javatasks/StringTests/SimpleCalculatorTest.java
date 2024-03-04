package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleCalculatorTest {
    @Test
    public void testLogarithm() {
        double expected = 2.0;
        assertEquals(expected, SimpleCalculator.logarithm(2, 4));
    }

    @Test
    public void testFactorial() {
        int expected = 120;
        assertEquals(expected, SimpleCalculator.factorial(5));
    }

    @Test
    public void testCalculator() {
        int expected = 7;
        assertEquals(expected, SimpleCalculator.calculator("3 + 4"));
    }
}
