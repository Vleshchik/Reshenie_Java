package ru.spb.reshenie.javatasks.string;
//Перенести каждое предложение на новую строку с отступом 4 пробела
public class SentenceFormatter {
    public static String indentSentences(String t) {
        t = "    " + t;
        return t.replaceAll("([.!?])\\s*([A-ZА-ЯЁ])", "$1\n    $2");
    }
}
