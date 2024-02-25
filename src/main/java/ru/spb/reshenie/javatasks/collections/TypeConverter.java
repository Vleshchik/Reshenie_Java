package ru.spb.reshenie.javatasks.collections;
import java.util.*;
import java.util.function.Function;
/*
Реализовать универсальный конвертер типов с возможностью добавления пользовательских:
- void addSupportedType(Class<T> type, Function<Object, T> convert) - регистрация функции конвертации для типа type
- T convert(Object value, Class<T> type) - конвертация объекта value в тип type, должна использовать функцию конвертации, зарегистрированную для type
- функции конвертации для часто используемых типов (Integer, String, Boolean) должны быть уже зарегистрированы
 */
public class TypeConverter {
    private final Map<Class<?>, Function<Object, ?>> converters = new HashMap<>();

    public <T> void addSupportedType(Class<T> type, Function<Object, T> convert) {
        converters.put(type, convert);
    }

    @SuppressWarnings("unchecked")
    public <T> T convert(Object value, Class<T> type) {
        Function<Object, ?> converter = converters.get(type);
        if (converter != null) {
            return (T) converter.apply(value);
        } else {
            throw new UnsupportedOperationException("Type conversion not supported");
        }
    }

    public TypeConverter() {
        addSupportedType(Integer.class, o -> Integer.parseInt(o.toString()));
        addSupportedType(String.class, o -> String.valueOf(o));
        addSupportedType(Boolean.class, o -> Boolean.parseBoolean(o.toString()));
    }
}
