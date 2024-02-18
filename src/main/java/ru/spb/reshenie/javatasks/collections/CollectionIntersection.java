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

    public static Set<Integer> parseInput(String input) {
        return Arrays.stream(input.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый список чисел через пробел:");
        String input1 = scanner.nextLine();
        Set<Integer> set1 = parseInput(input1);

        System.out.println("Введите второй список чисел через пробел:");
        String input2 = scanner.nextLine();
        Set<Integer> set2 = parseInput(input2);

        Set<Integer> intersection = findIntersection(set1, set2);
        System.out.println("Пересечение: " + intersection);
    }
}
