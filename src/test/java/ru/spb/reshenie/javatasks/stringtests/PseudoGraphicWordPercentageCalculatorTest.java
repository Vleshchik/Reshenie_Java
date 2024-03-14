package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.PseudoGraphicWordPercentageCalculator;

import java.util.Map;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class PseudoGraphicWordPercentageCalculatorTest {
    @Test
    void testCountWordFrequency() {
        PseudoGraphicWordPercentageCalculator calculator = new PseudoGraphicWordPercentageCalculator();
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 2);
        expected.put("banana", 1);
        expected.put("cherry", 1);

        String testString = "apple banana cherry apple";

        Map<String, Integer> result = calculator.countWordFrequency(testString);

        assertEquals(expected, result);
    }
}
