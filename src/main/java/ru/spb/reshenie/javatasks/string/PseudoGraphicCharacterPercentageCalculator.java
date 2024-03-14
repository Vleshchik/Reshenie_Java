package ru.spb.reshenie.javatasks.string;
import java.util.*;
/*
Процентное соотношение вхождений всех символов псевдографикой:
       -
       -
       -      -
-      -      -
-      -      -
a(20%) b(50%) c(30%)
 */
public class PseudoGraphicCharacterPercentageCalculator {
    public void printPercentageGraph(Map<Character, Integer> frequencyMap) {
        int total = frequencyMap.values().stream().mapToInt(Integer::intValue).sum();
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int percentage = (int) Math.round((double) entry.getValue() / total * 100);
            System.out.print(entry.getKey() + " (" + percentage + "%) ");
            for (int i = 0; i < percentage; i++) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
    public static Map<Character, Integer> countCharacterFrequency(String str){
        Map<Character, Integer> dict = new HashMap<>();
        for (char ch : str.toCharArray()) {
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);
        }
        return dict;
    }
}
