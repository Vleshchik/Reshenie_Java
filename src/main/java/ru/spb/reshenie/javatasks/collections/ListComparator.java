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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый список чисел через пробел:");
        String input1 = scanner.nextLine();
        List<Integer> list1 = parseInput(input1);

        System.out.println("Введите второй список чисел через пробел:");
        String input2 = scanner.nextLine();
        List<Integer> list2 = parseInput(input2);

        double similarityPercentage = compareLists(list1, list2);
        System.out.println("Процент схожести: " + similarityPercentage + "%");
    }
}
