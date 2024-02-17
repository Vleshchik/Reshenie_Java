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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        double sum = findRationalNumberSum(input);
        System.out.println("Сумма рациональных чисел: " + sum);
    }

}
