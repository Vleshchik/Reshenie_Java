package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.WordSorter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordSorterTest {
    @Test
    public void testSortSentence() {
        String input1 = "The quick brown fox";
        String input2 = "Jump over the lazy dog";

        assertEquals("The brown fox quick", WordSorter.sortSentence(input1));
        assertEquals("Jump dog lazy over the", WordSorter.sortSentence(input2));
    }
}
