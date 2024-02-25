package ru.spb.reshenie.javatasks;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import ru.spb.reshenie.javatasks.re.*;
import java.time.*;
import java.time.format.*;
import java.util.*;

public class RETest {
    @Test
    public void testCheckParenthesesWithValidInput() {
        BracketPairChecker bracketpairchecker = new BracketPairChecker();
        assertTrue(bracketpairchecker.checkParentheses("(a+b)+[c-d]"));
    }

    @Test
    public void testCheckParentheses() {
        BracketPairChecker bracketpairchecker = new BracketPairChecker();
        assertFalse(bracketpairchecker.checkParentheses("((a+b)+[c-d]"));
        assertFalse(bracketpairchecker.checkParentheses("(a+b]+[c-d)"));
    }
    @Test
    public void testConvertMarkdownListToHtml() {
        String input = "* Item 1\\n* Item 2\\n* Item 3";
        String expected = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
        String result = ConverterOfMarkdownListToHtml.convertMarkdownListToHtml(input);
        assertEquals(expected, result);
    }
    @Test
    public void testReplaceDatePlaceholder() {
        String input = "Today's date is $DATE{ddMMyyyy}";
        String expected = "Today's date is " + java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("ddMMyyyy"));
        String result = DateTemplateReplacer.replaceDatePlaceholder(input);
        assertEquals(expected, result);
    }
    @Test
    public void testFormatDateTime() {
        LocalDateTime now = LocalDateTime.now();
        String HHmmss = now.format(DateTimeFormatter.ofPattern("HHmmss"));
        String ddMMyy = now.format(DateTimeFormatter.ofPattern("ddMMyy"));
        String yyyyMMddHHmmss = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        assertEquals(HHmmss, DateFormatter.formatDateTime("HHmmss"));
        assertEquals(ddMMyy, DateFormatter.formatDateTime("ddMMyy"));
        assertEquals(yyyyMMddHHmmss, DateFormatter.formatDateTime("yyyyMMddHHmmss"));
    }
    @Test
    public void testParseTime_validFormat() {
        String time = "235959";
        String parsedTime = DateParser.parseTime(time);
        assertEquals("Parsed time (HHmmss): 23:59:59", parsedTime);
    }

    @Test
    public void testParseTime_invalidFormat() {
        String time = "256789";
        String parsedTime = DateParser.parseTime(time);
        assertEquals("Invalid time format", parsedTime);
    }

    @Test
    public void testParseDate1_validFormat() {
        String date1 = "311220";
        String parsedDate1 = DateParser.parseDate1(date1);
        assertEquals("Parsed date (ddMMyy): 31.12.20", parsedDate1);
    }

    @Test
    public void testParseDate1_invalidFormat() {
        String date1 = "321320";
        String parsedDate1 = DateParser.parseDate1(date1);
        assertEquals("Invalid date format", parsedDate1);
    }

    @Test
    public void testParseDate2_validFormat() {
        String date2 = "20211231235959";
        String parsedDate2 = DateParser.parseDate2(date2);
        assertEquals("Parsed date (yyyyMMddHHmmss): 31.12.2021 23:59:59", parsedDate2);
    }

    @Test
    public void testParseDate2_invalidFormat() {
        String date2 = "20211332245959";
        String parsedDate2 = DateParser.parseDate2(date2);
        assertEquals("Invalid date format", parsedDate2);
    }
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
    @Test
    public void testParseMap() {
        String input = "key1=value1,key2=value2,key3=value3";
        Map<String, String> expected = new HashMap<>();
        expected.put("key1", "value1");
        expected.put("key2", "value2");
        expected.put("key3", "value3");
        Map<String, String> result = MapParser.parseMap(input);
        assertEquals(expected, result);
    }
    @Test
    public void testWrapNumbersInSquareBrackets() {
        String input = "123";
        String result = NumberSquareBracketer.wrapNumbersInSquareBrackets(input);
        assertEquals("[123]", result);
    }
    @Test
    public void testCheckPasswordStrength_strongPassword() {
        String password = "AbcDe123";
        String expected = "Пароль надежный";
        String result = PasswordStrengthChecker.checkPasswordStrength(password);
        assertEquals(expected, result);
    }

    @Test
    public void testCheckPasswordStrength_weakPassword() {
        String password = "abcDEF";
        String expected = "Пароль слабый";
        String result = PasswordStrengthChecker.checkPasswordStrength(password);
        assertEquals(expected, result);
    }

    @Test
    public void testCheckPasswordStrength_unreliablePassword() {
        String password = "12345";
        String expected = "Пароль ненадежный";
        String result = PasswordStrengthChecker.checkPasswordStrength(password);
        assertEquals(expected, result);
    }
    @Test
    public void testParseAndSolveQuadraticEquation_validEquation() {
        String equation = "2x^2+3x-2";
        String expected = "Коэффициенты: a=2, b=3, c=-2. Корни уравнения: x1=0.5, x2=-2.0";
        String result = QuadraticEquationParser.parseAndSolveQuadraticEquation(equation);
        assertEquals(expected, result);
    }
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
    @Test
    public void testHighlightRepeatedItems_noRepeatedItems() {
        String input = "<ul><li>Apple</li><li>Orange</li><li>Banana</li></ul>";
        String expected = "<ul><li>Apple</li><li>Orange</li><li>Banana</li></ul>";
        String result = RepeatedListItemTagger.highlightRepeatedItems(input);
        assertEquals(expected, result);
    }

    @Test
    public void testHighlightRepeatedItems_oneRepeatedItem() {
        String input = "<ul><li>Apple</li><li>Orange</li><li>Apple</li></ul>";
        String expected = "<ul><li>Apple</li><li>Orange</li><b>Apple</b></ul>";
        String result = RepeatedListItemTagger.highlightRepeatedItems(input);
        assertEquals(expected, result);
    }
    @Test
    public void testHighlightDuplicateWords_noRepeatedWords() {
        String input = "This is a test sentence without any repeated words";
        String expected = "This is a test sentence without any repeated words";
        String result = RepeatedWordTagger.highlightDuplicateWords(input);
        assertEquals(expected, result);
    }

    @Test
    public void testHighlightDuplicateWords_oneRepeatedWord() {
        String input = "This is a test test sentence with one repeated word";
        String expected = "This is a test <strong>test</strong> sentence with one repeated word";
        String result = RepeatedWordTagger.highlightDuplicateWords(input);
        assertEquals(expected, result);
    }
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
    @Test
    public void testCheckPositiveNumber() {
        assertTrue(StringValidator.checkPositiveNumber("123"));
        assertTrue(StringValidator.checkPositiveNumber("123.456"));
        assertFalse(StringValidator.checkPositiveNumber("-123"));
        assertFalse(StringValidator.checkPositiveNumber("abc"));
    }

    @Test
    public void testCheckIntegerNumber() {
        assertTrue(StringValidator.checkIntegerNumber("123"));
        assertTrue(StringValidator.checkIntegerNumber("-123"));
        assertFalse(StringValidator.checkIntegerNumber("123.456"));
        assertFalse(StringValidator.checkIntegerNumber("abc"));
    }

    @Test
    public void testCheckDecimalNumber() {
        assertTrue(StringValidator.checkDecimalNumber("123.456"));
        assertTrue(StringValidator.checkDecimalNumber("-123.456"));
        assertFalse(StringValidator.checkDecimalNumber("123"));
        assertFalse(StringValidator.checkDecimalNumber("abc"));
    }

    @Test
    public void testCheckComplexNumber() {
        assertTrue(StringValidator.checkComplexNumber("123+456i"));
        assertTrue(StringValidator.checkComplexNumber("-123.456e-78+789.012i"));
        assertFalse(StringValidator.checkComplexNumber("123"));
        assertFalse(StringValidator.checkComplexNumber("abc"));
    }

    @Test
    public void testCheckValidIPAddress() {
        assertTrue(StringValidator.checkValidIPAddress("192.168.0.1"));
        assertTrue(StringValidator.checkValidIPAddress("255.255.255.0"));
        assertFalse(StringValidator.checkValidIPAddress("256.168.0.1"));
        assertFalse(StringValidator.checkValidIPAddress("192.168.0.256"));
    }

    @Test
    public void testCheckValidMACAddress() {
        assertTrue(StringValidator.checkValidMACAddress("00:1A:C2:7B:00:47"));
        assertTrue(StringValidator.checkValidMACAddress("00-1A-C2-7B-00-47"));
        assertFalse(StringValidator.checkValidMACAddress("00:1A:C2:7B:00"));
        assertFalse(StringValidator.checkValidMACAddress("00:1A:C2:7B:00:47:00"));
    }

    @Test
    public void testCheckValidGUID() {
        assertTrue(StringValidator.checkValidGUID("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
        assertTrue(StringValidator.checkValidGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertFalse(StringValidator.checkValidGUID("e02fd0e4-00fd-090A-0d00a0038ba0"));
        assertFalse(StringValidator.checkValidGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0-"));
    }
    @Test
    public void testConvertTextFormatting() {
        String input = "This is a **test** *sentence* with **formatting**";
        String expected = "This is a <b>test</b> <i>sentence</i> with <b>formatting</b>";
        String result = TextFormatter.convertTextFormatting(input);
        assertEquals(expected, result);
    }
    @Test
    public void testShortenWords_singleWord() {
        String input = "Hello";
        String expected = "H-o";
        String result = WordShortener.shortenWords(input);
        assertEquals(expected, result);
    }
    @Test
    public void testShortenWords() {
        String input = "The quick brown fox jumps over the lazy dog";
        String expected = "T-e q-k b-n f-x j-s o-r t-e l-y d-g";
        String result = WordShortener.shortenWords(input);
        assertEquals(expected, result);
    }
}
