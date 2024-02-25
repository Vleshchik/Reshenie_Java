package ru.spb.reshenie.javatasks;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

public class StringTest {
    @Test
    public void testCollapseDuplicates() {
        String input1 = "aabbccdd";
        String input2 = "aaaabbbbcccc";

        assertEquals("abcd", CharacterCollapser.collapseDuplicates(input1));
        assertEquals("abc", CharacterCollapser.collapseDuplicates(input2));
    }
    @Test
    public void testCountCharInSentence() {
        String input1 = "Hello, World!";
        String input2 = "Java is fun!";

        assertEquals(2, CharacterOccurrenceCounter.countCharInSentence(input1, 'o'));
        assertEquals(3, CharacterOccurrenceCounter.countCharInSentence(input1, 'l'));
        assertEquals(0, CharacterOccurrenceCounter.countCharInSentence(input1, 'z'));

        assertEquals(1, CharacterOccurrenceCounter.countCharInSentence(input2, 'J'));
        assertEquals(2, CharacterOccurrenceCounter.countCharInSentence(input2, 'a'));
        assertEquals(0, CharacterOccurrenceCounter.countCharInSentence(input2, 'x'));
    }
    @Test
    public void testFormatName() {
        String input1 = "ИваНов ИВАН иВаНОвиЧ";
        String input2 = "ЛеЩИк ВАДИМ дмитриевич";

        assertEquals("Иванов Иван Иванович", NameFormatter.formatName(input1));
        assertEquals("Лещик Вадим Дмитриевич", NameFormatter.formatName(input2));
    }

    @Test
    public void testGetInitials() {
        String input1 = "ИваНов ИВАН иВаНОвиЧ";
        String input2 = "ЛеЩИк ВАДИМ дмитриевич";

        assertEquals("Иванов И.И.", NameFormatter.getInitials(input1));
        assertEquals("Лещик В.Д.", NameFormatter.getInitials(input2));
    }
    @Test
    public void testSortSentence() {
        String input1 = "The quick brown fox";
        String input2 = "Jump over the lazy dog";

        assertEquals("The brown fox quick", WordSorter.sortSentence(input1));
        assertEquals("Jump dog lazy over the", WordSorter.sortSentence(input2));
    }
    @Test
    public void testReverseWords1() {
        String input1 = "The quick brown fox";
        String input2 = "Jump over the lazy dog";

        assertEquals("fox brown quick The", WordReverser.reverseWords1(input1));
        assertEquals("dog lazy the over Jump", WordReverser.reverseWords1(input2));
    }

    @Test
    public void testReverseWords2() {
        String input1 = "The quick brown fox";
        String input2 = "Jump over the lazy dog";

        assertEquals("ehT kciuq nworb xof", WordReverser.reverseWords2(input1));
        assertEquals("pmuJ revo eht yzal god", WordReverser.reverseWords2(input2));
    }
    @Test
    public void testCountCharacterFrequency() {
        String input = "hello";

        Map<Character, Integer> expected = new HashMap<>();
        expected.put('h', 1);
        expected.put('e', 1);
        expected.put('l', 2);
        expected.put('o', 1);

        assertEquals(expected, EachCharacterOccurrenceCounter.countCharacterFrequency(input));
    }
    @Test
    public void testCountLines() {
        String input = "First line\nSecond line\nThird line";

        assertEquals(3, LineCountCalculator.countLines(input));
    }
    @Test
    public void testCountMaxCharacterFrequency() {
        String input = "apple";
        Map<Character, Integer> expected = new HashMap<>();
        expected.put('p', 2);

        assertEquals(expected, MostFrequentCharacterFinder.countMaxCharacterFrequency(input));
    }
    @Test
    public void testFindPalindromes() {
        String input = "level radar apple deed";
        List<String> expected = Arrays.asList("level", "radar", "deed");

        assertEquals(expected, PalindromeCounter.findPalindromes(input));
    }
    @Test
    public void testGenerateString() {
        int length = 10;
        String result = RandomStringGenerator.generateString(length);

        assertEquals(length, result.length());

        // Check if the generated string contains only valid characters
        HashSet<Character> validCharacters = new HashSet<>();
        for (char c : "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray()) {
            validCharacters.add(c);
        }

        for (char c : result.toCharArray()) {
            assertTrue(validCharacters.contains(c));
        }
    }
    @Test
    public void testTransliterate() {
        String input = "Привет, мир!";
        String expected = "Privet, mir!";
        assertEquals(expected, RussianTransliterator.transliterate(input));
    }
    @Test
    public void testIndentSentences() {
        String input = "This is a sentence. This is another one! And a third?";
        String expected = "    This is a sentence.\n    This is another one!\n    And a third?";
        assertEquals(expected, SentenceFormatter.indentSentences(input));
    }
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
    @Test
    public void testReverseString() {
        String input = "Hello";
        String expected = "olleH";
        assertEquals(expected, StringReverser.reverseString(input));
    }
    @Test
    public void testCountSubstringInSentence() {
        String input = "Hello, hello, hello";
        String subString = "hello";
        int expected = 3;
        assertEquals(expected, SubstringOccurrenceCounter.countSubstringInSentence(input, subString));
    }
    @Test
    public void testCountWordsInSentence() {
        String input = "The quick brown fox jumps over the lazy dog";
        int expected = 9;
        assertEquals(expected, WordCountCalculator.countWordsInSentence(input));
    }
    @Test
    public void testCountWordFrequency() {
        String input = "apple banana apple orange banana apple";
        Map<String, Integer> expected = new HashMap<>();
        expected.put("apple", 3);
        expected.put("banana", 2);
        expected.put("orange", 1);
        assertEquals(expected, WordOccurrenceCounter.countWordFrequency(input));
    }
    @Test
    public void testIndentText() {
        String input = "Line 1\nLine 2\nLine 3";
        String expected = "    Line 1\n    Line 2\n    Line 3\n";
        assertEquals(expected, TextIndenter.indentText(input));
    }
    @Test
    public void testAutoLineBreak() {
        String input = "This is a sample text for auto line breaking";
        int maxLength = 10;
        String expected = "This is a \nsample tex\nt for auto\n line brea\nking\n";
        assertEquals(expected, WordAutoLineBreaker.autoLineBreak(input, maxLength));
    }
}
