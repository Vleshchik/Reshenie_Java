package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
//Найти сумму всех рациональных чисел в предложении
public class RationalNumberSumCalculator {
    public static double findRationalNumberSum(String input) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);

        double sum = 0.0;
        while (matcher.find()) {
            sum += Double.parseDouble(matcher.group());
        }
        return sum;
    }
}
