package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
//Найти сумму цифр каждого рационального числа в предложении
public class DigitSumCalculator {


    public static String findAndPrintRationalNumberDigitSums(String input) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);
        String number = null;
        double sum = 0.0;
        while (matcher.find()) {
            number = matcher.group();

            if (number.contains(".")) {
                String[] parts = number.split("\\.");
                for (char c : (parts[0] + parts[1]).toCharArray()) {
                    if (Character.isDigit(c)) {
                        sum += Character.getNumericValue(c);
                    }
                }
            } else {
                for (char c : number.toCharArray()) {
                    if (Character.isDigit(c)) {
                        sum += Character.getNumericValue(c);
                    }
                }
            }
        }
        
        return "Сумма цифр числа " + number + ": " + sum;
    }
}
