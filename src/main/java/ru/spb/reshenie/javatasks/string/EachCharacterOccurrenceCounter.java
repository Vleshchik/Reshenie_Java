package ru.spb.reshenie.javatasks.string;
//Кол-во вхождений каждого символа
import java.util.*;
public class EachCharacterOccurrenceCounter {
    public static Map<Character, Integer> countCharacterFrequency(String str){
        Map<Character, Integer> dict = new HashMap<>();
        for (char ch : str.toCharArray()) {
            dict.put(ch, dict.getOrDefault(ch, 0) + 1);
        }
        return dict;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(countCharacterFrequency(s));
    }
}
