package ru.spb.reshenie.javatasks.re;
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
    public static boolean checkPositiveNumber(String input) {
        Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean checkIntegerNumber(String input) {
        Pattern pattern = Pattern.compile("[+-]?\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean checkDecimalNumber(String input) {
        Pattern pattern = Pattern.compile("[+-]?\\d*\\.\\d+");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean checkComplexNumber(String input) {
        Pattern pattern = Pattern.compile("[-+]?[0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?[+-][0-9]*\\.?[0-9]+([eE][-+]?[0-9]+)?i");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean checkValidIPAddress(String input) {
        Pattern pattern = Pattern.compile("((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean checkValidMACAddress(String input) {
        Pattern pattern = Pattern.compile("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
    public static boolean checkValidGUID(String input) {
        Pattern pattern = Pattern.compile("^[{]?[0-9a-fA-F]{8}[-]([0-9a-fA-F]{4}[-]){3}[0-9a-fA-F]{12}[}]?$");
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}
