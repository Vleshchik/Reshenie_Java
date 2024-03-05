package ru.spb.reshenie.javatasks.collections;
import java.util.*;
import java.util.stream.Collectors;

public class TextSplitter {
    public static List<String> splitText(String s) {
        String text = s; //"Это пример текста.\nОн будет разбит на строки\nи помещен в список.";
        List<String> lines = Arrays.asList(s.split("\\n"));
        return lines;
    }
}