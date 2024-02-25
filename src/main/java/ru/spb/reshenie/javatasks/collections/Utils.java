package ru.spb.reshenie.javatasks.collections;

import java.util.*;
import java.util.function.Function;

//Реализовать метод приведения коллекции к типу с дженериком с проверкой типов элементов: Collection -> Collection<T>
public class Utils {
    static <T> Collection<T> castCollection(Collection<?> collection, Class<T> elementType) {
        List<T> result = new ArrayList<>();
        for (Object obj : collection) {
            if (elementType.isInstance(obj)) {
                result.add(elementType.cast(obj));
            } else {
                throw new ClassCastException("Element type mismatch");
            }
        }
        return result;
    }
}