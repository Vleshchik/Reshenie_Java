package ru.spb.reshenie.javatasks.string;
//Посчитать количество строк в тексте
public class LineCountCalculator {
    public static int countLines(String t) {
        String[] lines = t.split("\\n");
        return lines.length;
    }
}
