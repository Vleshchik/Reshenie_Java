package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.spb.reshenie.javatasks.collections.TypeConverter;

public class TypeConverterTest {
    @Test
    public void testConvert() {
        TypeConverter typeConverter = new TypeConverter();

        typeConverter.addSupportedType(Integer.class, o -> Integer.parseInt(o.toString()));
        typeConverter.addSupportedType(String.class, o -> String.valueOf(o));
        typeConverter.addSupportedType(Boolean.class, o -> Boolean.parseBoolean(o.toString()));

        Object intValue = typeConverter.convert("10", Integer.class);
        Object stringValue = typeConverter.convert(10, String.class);
        Object booleanValue = typeConverter.convert("true", Boolean.class);

        assertEquals(10, intValue);
        assertEquals("10", stringValue);
        assertEquals(true, booleanValue);
    }
}
