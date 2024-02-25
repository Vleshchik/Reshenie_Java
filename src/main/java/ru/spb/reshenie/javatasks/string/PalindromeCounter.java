package ru.spb.reshenie.javatasks.string;
//Найти кол-во палиндромов в предложении и вывести их
import java.util.*;
public class PalindromeCounter {
    public static List<String> findPalindromes(String s) {
        List<String> palindromes = new ArrayList<>();
        String[] words = s.split("\\s+");
        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }
        return palindromes;
    }
    private static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }
}
