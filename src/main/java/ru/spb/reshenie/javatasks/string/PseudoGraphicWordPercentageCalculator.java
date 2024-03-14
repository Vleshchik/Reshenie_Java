package ru.spb.reshenie.javatasks.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Процентное соотношение вхождений всех слов псевдографикой:
  -
- -
- -
в на
 */
public class PseudoGraphicWordPercentageCalculator {
    public void printPercentageGraph(Map<String, Integer> frequencyMap) {
        int total = frequencyMap.values().stream().mapToInt(Integer::intValue).sum();
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            int percentage = (int) Math.round((double) entry.getValue() / total * 100);
            System.out.print(entry.getKey());
            for (int i = 0; i < percentage; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public Map<String, Integer> countWordFrequency(String str){
        String[] words = str.split("\\s+");
        Map<String, Integer> dict = new HashMap<>();
        for (String word : words) {
            dict.put(word, dict.getOrDefault(word, 0) + 1);
        }
        return dict;
    }
}
