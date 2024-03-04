package ru.spb.reshenie.javatasks.StringTests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.string.NameFormatter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NameFormatterTest {
    @Test
    public void testFormatName() {
        String input1 = "ИваНов ИВАН иВаНОвиЧ";
        String input2 = "ЛеЩИк ВАДИМ дмитриевич";

        assertEquals("Иванов Иван Иванович", NameFormatter.formatName(input1));
        assertEquals("Лещик Вадим Дмитриевич", NameFormatter.formatName(input2));
    }
}
