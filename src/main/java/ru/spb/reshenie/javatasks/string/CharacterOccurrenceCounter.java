package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Посчитать кол-во вхождений символа
public class CharacterOccurrenceCounter {

    public static int countCharInSentence(String s, char ch){
        int count = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine().toLowerCase();
        String letter = sc.nextLine().toLowerCase();
        char ch = letter.charAt(0);
        System.out.println(countCharInSentence(sentence, ch));
    }
}
