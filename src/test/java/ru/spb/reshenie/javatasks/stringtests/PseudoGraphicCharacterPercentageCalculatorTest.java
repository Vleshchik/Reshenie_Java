package ru.spb.reshenie.javatasks.stringtests;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.spb.reshenie.javatasks.string.PseudoGraphicCharacterPercentageCalculator;

public class PseudoGraphicCharacterPercentageCalculatorTest {
    @Test
    void testCountCharacterFrequency() {
        PseudoGraphicCharacterPercentageCalculator calculator = new PseudoGraphicCharacterPercentageCalculator();
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('a', 2);
        expected.put('b', 1);
        expected.put('c', 1);

        String testString = "abca";

        Map<Character, Integer> result = calculator.countCharacterFrequency(testString);

        assertEquals(expected, result);
    }
}
