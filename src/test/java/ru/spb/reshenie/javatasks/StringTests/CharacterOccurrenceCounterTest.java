package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.CharacterOccurrenceCounter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterOccurrenceCounterTest {
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
}
