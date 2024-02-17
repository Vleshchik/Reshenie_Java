package ru.spb.reshenie.javatasks.string;

import java.util.*;

//Развернуть слова в предложении
public class WordReverser {
    //Вариант 1 - меняем порядок слов в предложении
    public static String reverseWords1(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]).append(" ");
        }
        return reversedSentence.toString().trim();
    }
    //Вариант 2 - разворачиваем слова, но не порядок
    public static String reverseWords2(String s) {
        String[] words = s.split("\\s+");
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = 0; i <= words.length - 1; i++) {
            reversedSentence.append(new StringBuilder(words[i]).reverse()).append(" ");
        }
        return reversedSentence.toString().trim();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(reverseWords1(sentence));
        System.out.println(reverseWords2(sentence));
    }
}
