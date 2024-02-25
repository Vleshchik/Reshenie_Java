package ru.spb.reshenie.javatasks.string;
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
}
