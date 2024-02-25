package ru.spb.reshenie.javatasks.string;
//Добавить в текст отступы с каждой новой строки 4 пробела
public class TextIndenter {
    public static String indentText(String input) {
        StringBuilder indentedText = new StringBuilder();
        String[] lines = input.split("\n");
        for (String line : lines) {
            indentedText.append("    ").append(line).append("\n");
        }
        return indentedText.toString();
    }
}
