package ru.spb.reshenie.javatasks.re;
//Преобразовать текст, обрамленный в звездочки, в курсив (<i></i>), двойные звездочки - жирный (<b></b>)
import java.util.regex.*;
import java.util.*;
public class TextFormatter {
    public static String convertTextFormatting(String input) {
        Pattern italicPattern = Pattern.compile("\\*\\*(.*?)\\*\\*");
        Matcher italicMatcher = italicPattern.matcher(input);
        input = italicMatcher.replaceAll("<b>$1</b>");

        Pattern boldPattern = Pattern.compile("\\*(.*?)\\*");
        Matcher boldMatcher = boldPattern.matcher(input);
        input = boldMatcher.replaceAll("<i>$1</i>");

        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine(); //This is a **bold** and *italic* text.
        String convertedText = convertTextFormatting(text);
        System.out.println(convertedText);
    }
}
