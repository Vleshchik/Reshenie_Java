package ru.spb.reshenie.javatasks.string;

import java.util.*;
import java.util.stream.Collectors;

//Отсортировать слова в строке по алфавиту, вывести в строку и в столбец
public class WordSorter {
    public static String sortSentence(String s){

        return Arrays.stream(s.split("\\s+"))
                .sorted()
                .collect(Collectors.joining(" "));
    }
}
