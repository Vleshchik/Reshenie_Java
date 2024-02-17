package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;
import java.util.regex.*;
/*
Проверить, что введенная строка является положительным числом
- целым числом
- десятичным числом
- комплексным числом
- валидным IP-адресом.
- валидным MAC-адресом.
- валидным GUID (e02fd0e4-00fd-090A-ca30-0d00a0038ba0).
 */
public class StringValidator {
    public static void checkPositiveNumber(String input) {
        Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a positive number.");
        } else {
            System.out.println(input + " is not a positive number.");
        }
    }

    public static void checkIntegerNumber(String input) {
        Pattern pattern = Pattern.compile("[+-]?\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is an integer number.");
        } else {
            System.out.println(input + " is not an integer number.");
        }
    }

    public static void checkDecimalNumber(String input) {
        Pattern pattern = Pattern.compile("[+-]?\\d*\\.\\d+");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a decimal number.");
        } else {
            System.out.println(input + " is not a decimal number.");
        }
    }

    public static void checkComplexNumber(String input) {
        Pattern pattern = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?[+-][0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?i");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a complex number.");
        } else {
            System.out.println(input + " is not a complex number.");
        }
    }

    public static void checkValidIPAddress(String input) {
        Pattern pattern = Pattern.compile("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a valid IP address.");
        } else {
            System.out.println(input + " is not a valid IP address.");
        }
    }

    public static void checkValidMACAddress(String input) {
        Pattern pattern = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a valid MAC address.");
        } else {
            System.out.println(input + " is not a valid MAC address.");
        }
    }

    public static void checkValidGUID(String input) {
        Pattern pattern = Pattern.compile("^[{]?[0-9a-fA-F]{8}[-]([0-9a-fA-F]{4}[-]){3}[0-9a-fA-F]{12}[}]?$");
        Matcher matcher = pattern.matcher(input);
        if (matcher.matches()) {
            System.out.println(input + " is a valid GUID.");
        } else {
            System.out.println(input + " is not a valid GUID.");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        checkPositiveNumber(input);
        checkIntegerNumber(input);
        checkDecimalNumber(input);
        checkComplexNumber(input);
        checkValidIPAddress(input);
        checkValidMACAddress(input);
        checkValidGUID(input);
    }
}
