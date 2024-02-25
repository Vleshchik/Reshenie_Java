package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
//Сократить все слова в предложении, оставив первую и последнюю буквы через дефис
public class WordShortener {
    public static String shortenWords(String input) {
        Pattern pattern = Pattern.compile("(\\b\\w)\\w*(\\w\\b)");
        Matcher matcher = pattern.matcher(input);
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, matcher.group(1) + "-" + matcher.group(2));
        }
        matcher.appendTail(result);
        return result.toString();
    }
}
