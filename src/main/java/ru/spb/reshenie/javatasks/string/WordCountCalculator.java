package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Посчитать кол-во слов в предложении
public class WordCountCalculator {
    public static int countWordsInSentence(String s){
        String[] words = s.split("\\s+");
        return words.length;
    }
}
