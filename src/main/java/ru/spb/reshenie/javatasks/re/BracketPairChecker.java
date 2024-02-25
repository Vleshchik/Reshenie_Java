package ru.spb.reshenie.javatasks.re;
import java.util.regex.*;
//Проверить парность скобок в тексте
public class BracketPairChecker {
    public boolean checkParentheses(String input) {
        input = input.replaceAll("[^\\[\\]{}()]", "");
        Pattern pattern = Pattern.compile("\\([^(){}\\[\\]]*\\)|\\{[^(){}\\[\\]]*\\}|\\[[^(){}\\[\\]]*\\]");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            input = matcher.replaceAll("");
            matcher = pattern.matcher(input);
        }

        return input.isEmpty();
    }
}
