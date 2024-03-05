package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.WordReverser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordReverserTest {
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
}
