package ru.spb.reshenie.javatasks.re;
import java.util.*;

//Выделить тегом <strong> все повторяющиеся слова.
public class RepeatedWordTagger {
    public static String highlightDuplicateWords(String sentence) {
        String[] words = sentence.split("\\s+");
        Set<String> seenWords = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!seenWords.add(word)) {
                result.append("<strong>").append(word).append("</strong>").append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String result = highlightDuplicateWords(sentence);
        System.out.println(result);
    }
}
