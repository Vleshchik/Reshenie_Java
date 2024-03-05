package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.RationalNumberSumCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RationalNumberSumCalculatorTest {
    @Test
    public void testFindRationalNumberSum_validInput() {
        String input = "The sum of 1.5 and 2.75";
        double expected = 4.25;
        double result = RationalNumberSumCalculator.findRationalNumberSum(input);
        assertEquals(expected, result, 0.0001);
    }

    @Test
    public void testFindRationalNumberSum_negativeNumbers() {
        String input = "There are -3.5 and -2.25 in the list";
        double expected = -5.75;
        double result = RationalNumberSumCalculator.findRationalNumberSum(input);
        assertEquals(expected, result, 0.0001);
    }
}
