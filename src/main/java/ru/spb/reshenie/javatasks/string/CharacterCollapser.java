package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Схлопнуть повторяющиеся символы
public class CharacterCollapser {
    public static String collapseDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        char prev = '\0';
        for (char ch : str.toCharArray()) {
            if (ch != prev) {
                result.append(ch);
                prev = ch;
            }
        }
        return result.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(collapseDuplicates(sentence));
    }
}
