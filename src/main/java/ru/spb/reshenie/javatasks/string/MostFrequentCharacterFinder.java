package ru.spb.reshenie.javatasks.string;
//Найти какие символы встречаются чаще всего
import java.util.*;
public class MostFrequentCharacterFinder {
    public static Map<Character, Integer> countMaxCharacterFrequency(String str){
        Map<Character, Integer> dict = new HashMap<>();
        Map<Character, Integer> mostFrequentCharacters = new HashMap<>();
        for (char ch : str.toCharArray()) {
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);
        }
        int maxFrequency = dict.values().stream().max(Integer::compare).orElse(0);

        for (Map.Entry<Character, Integer> entry : dict.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mostFrequentCharacters.put(entry.getKey(), entry.getValue());
            }
        }
        return mostFrequentCharacters;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countMaxCharacterFrequency(s));
    }
}
