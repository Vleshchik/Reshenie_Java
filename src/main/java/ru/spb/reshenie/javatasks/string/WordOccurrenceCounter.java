package ru.spb.reshenie.javatasks.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Кол-во вхождений каждого слова
public class WordOccurrenceCounter {
    public static Map<String, Integer> countWordFrequency(String str){
        String[] words = str.split("\\s+");
        Map<String, Integer> dict = new HashMap<>();
        for (String word : words) {
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }
        return dict;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(countWordFrequency(sentence));
    }
}
