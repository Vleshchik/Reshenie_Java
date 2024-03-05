package ru.spb.reshenie.javatasks.collections;
import java.util.*;
import java.util.stream.Collectors;
//Найти пересечение двух коллекций с элементами одинакового типа
public class CollectionIntersection {
    public static <T> Set<T> findIntersection(Set<T> set1, Set<T> set2) {
        return set1.stream()
                .filter(set2::contains)
                .collect(Collectors.toSet());
    }
}
