package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.RepeatedListItemTagger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedListItemTaggerTest {
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
}
