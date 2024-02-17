package ru.spb.reshenie.javatasks.collections;
import java.util.*;
import java.util.stream.Collectors;
//Отсортировать список пузырьком
public class BubbleSorter {
    public static void bubbleSort(List<Integer> list) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    // Обмен элементов
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String numbers = sc.nextLine();

        List<Integer> numbersList = Arrays.stream(numbers.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        bubbleSort(numbersList);
        System.out.println(numbersList);
    }
}
