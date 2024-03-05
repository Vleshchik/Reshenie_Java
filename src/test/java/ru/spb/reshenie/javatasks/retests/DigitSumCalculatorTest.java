package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.DigitSumCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumCalculatorTest {
    @Test
    public void testFindAndPrintRationalNumberDigitSums_integerInput() {
        String input = "12345";
        String result = DigitSumCalculator.findAndPrintRationalNumberDigitSums(input);
        assertEquals("Сумма цифр числа 12345: 15.0", result);
    }
    @Test
    public void testFindAndPrintRationalNumberDigitSums_decimalInput() {
        String input = "123.45";
        String result = DigitSumCalculator.findAndPrintRationalNumberDigitSums(input);
        assertEquals("Сумма цифр числа 123.45: 15.0", result);
    }
    @Test
    public void testFindAndPrintRationalNumberDigitSums_negativeInput() {
        String input = "-543.21";
        String result = DigitSumCalculator.findAndPrintRationalNumberDigitSums(input);
        assertEquals("Сумма цифр числа -543.21: 15.0", result);
    }
    @Test
    public void testFindAndPrintRationalNumberDigitSums_nonNumericInput() {
        String input = "abc";
        String result = DigitSumCalculator.findAndPrintRationalNumberDigitSums(input);
        assertEquals("Сумма цифр числа null: 0.0", result);
    }
}
