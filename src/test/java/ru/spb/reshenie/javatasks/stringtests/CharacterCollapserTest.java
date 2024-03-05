package ru.spb.reshenie.javatasks.stringtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.CharacterCollapser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CharacterCollapserTest {
    @Test
    public void testCollapseDuplicates() {
        String input1 = "aabbccdd";
        String input2 = "aaaabbbbcccc";

        assertEquals("abcd", CharacterCollapser.collapseDuplicates(input1));
        assertEquals("abc", CharacterCollapser.collapseDuplicates(input2));
    }
}
