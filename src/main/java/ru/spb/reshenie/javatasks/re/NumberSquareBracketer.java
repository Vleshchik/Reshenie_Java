package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
//Обернуть в квадратные скобки все числа в предложении
public class NumberSquareBracketer {


    public static String wrapNumbersInSquareBrackets(String input) {
        Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);

        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            matcher.appendReplacement(result, "[" + matcher.group() + "]");
        }
        matcher.appendTail(result);

        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = wrapNumbersInSquareBrackets(input);
        System.out.println(result);
    }
}
