package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Кол-во вхождений подстроки
public class SubstringOccurrenceCounter {
    public static int countSubstringInSentence(String s, String ss){
        int n = ss.length();
        int count = 0;
        for (int i = 0; i <= (s.length() - n); i++){
            if (ss.equalsIgnoreCase(s.substring(i, i + n))){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String substring = sc.nextLine();

        System.out.println(countSubstringInSentence(sentence, substring));
    }
}
