package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.ConverterOfMarkdownListToHtml;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConverterOfMarkdownListToHtmlTest {
    @Test
    public void testConvertMarkdownListToHtml() {
        String input = "* Item 1\\n* Item 2\\n* Item 3";
        String expected = "<ul><li>Item 1</li><li>Item 2</li><li>Item 3</li></ul>";
        String result = ConverterOfMarkdownListToHtml.convertMarkdownListToHtml(input);
        assertEquals(expected, result);
    }
}
