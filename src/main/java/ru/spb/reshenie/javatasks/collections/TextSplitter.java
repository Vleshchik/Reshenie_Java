package ru.spb.reshenie.javatasks.collections;
import java.util.*;
import java.util.stream.Collectors;

public class TextSplitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); //"Это пример текста.\nОн будет разбит на строки\nи помещен в список.";

        List<String> lines = Arrays.stream(text.split("\\\\n"))
                .collect(Collectors.toList());

        // Вывод списка строк
        lines.forEach(System.out::println);
    }
}