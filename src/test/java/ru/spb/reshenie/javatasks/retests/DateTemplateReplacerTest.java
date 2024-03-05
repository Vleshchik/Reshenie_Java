package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.DateTemplateReplacer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateTemplateReplacerTest {
    @Test
    public void testReplaceDatePlaceholder() {
        String input = "Today's date is $DATE{ddMMyyyy}";
        String expected = "Today's date is " + java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("ddMMyyyy"));
        String result = DateTemplateReplacer.replaceDatePlaceholder(input);
        assertEquals(expected, result);
    }
}
