package ru.spb.reshenie.javatasks.collections;
/*
Реализовать мапу объектов с методами получения значения требуемого типа - getInt, getString, getDouble, getBool.
Методы должны не просто кастовать объекты, а преобразовывать их к нужному типу, если это возможно, или выкидывать исключение
 */
import java.util.*;
public class ObjectMap {
    private Map<String, Object> map = new HashMap<>();

    public ObjectMap(Map<String, Object> map) {
        this.map = map;
    }

    public int getInt(String key) {
        Object value = map.get(key);
        if (value instanceof Integer) {
            return (int) value;
        } else {
            throw new ClassCastException("Value is not an Integer");
        }
    }

    public String getString(String key) {
        Object value = map.get(key);
        if (value instanceof String) {
            return (String) value;
        } else {
            throw new ClassCastException("Value is not a String");
        }
    }

    public double getDouble(String key) {
        Object value = map.get(key);
        if (value instanceof Double) {
            return (double) value;
        } else {
            throw new ClassCastException("Value is not a Double");
        }
    }

    public boolean getBool(String key) {
        Object value = map.get(key);
        if (value instanceof Boolean) {
            return (boolean) value;
        } else {
            throw new ClassCastException("Value is not a Boolean");
        }
    }
}
