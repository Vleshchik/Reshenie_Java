package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
//Найти сумму цифр каждого рационального числа в предложении
public class DigitSumCalculator {


    public static void findAndPrintRationalNumberDigitSums(String input) {
        Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String number = matcher.group();
            double sum = 0.0;

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

            System.out.println("Сумма цифр числа " + number + ": " + sum);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        findAndPrintRationalNumberDigitSums(input);
    }
}
