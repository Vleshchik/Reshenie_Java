package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
//Проверить парность скобок в тексте
public class BracketPairChecker {
    public static boolean checkParentheses(String input) {
        Pattern pattern = Pattern.compile("\\([^(){}\\[\\]]*\\)|\\{[^(){}\\[\\]]*\\}|\\[[^(){}\\[\\]]*\\]");
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        return count % 2 == 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (checkParentheses(input)) {
            System.out.println("Скобки сбалансированы");
        } else {
            System.out.println("Скобки не сбалансированы");
        }
    }
}
