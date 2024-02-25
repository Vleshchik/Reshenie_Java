package ru.spb.reshenie.javatasks.re;
import java.util.regex.*;
import java.util.*;
//Преобразовать текст, обрамленный в звездочки, в курсив (<i></i>), двойные звездочки - жирный (<b></b>)
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
}
