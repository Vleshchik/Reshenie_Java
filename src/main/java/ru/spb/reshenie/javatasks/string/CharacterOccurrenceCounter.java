package ru.spb.reshenie.javatasks.string;
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
}
