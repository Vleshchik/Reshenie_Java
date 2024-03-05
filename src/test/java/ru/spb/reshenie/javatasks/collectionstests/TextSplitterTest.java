package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.collections.TextSplitter;

import java.util.*;

import static junit.framework.Assert.assertEquals;

public class TextSplitterTest {
    @Test
    public void testSplitText() {
        String inputText = "Это пример текста.\nОн будет разбит на строки\nи помещен в список.";
        List<String> expectedLines = Arrays.asList("Это пример текста.", "Он будет разбит на строки", "и помещен в список.");
        assertEquals(expectedLines, TextSplitter.splitText(inputText));
    }
}
