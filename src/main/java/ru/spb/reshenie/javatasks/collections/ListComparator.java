package ru.spb.reshenie.javatasks.collections;
import java.util.*;
import java.util.stream.Collectors;
//Реализовать метод сравнения списков с элементами одинакового типа, метод должен возвращать процент схожести
public class ListComparator {
    public static <T> double compareLists(List<T> list1, List<T> list2) {
        int intersectionSize = Math.toIntExact(list1.stream().filter(list2::contains).count());
        return (double) intersectionSize / Math.max(list1.size(), list2.size()) * 100;
    }

    public static List<Integer> parseInput(String input) {
        return Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
