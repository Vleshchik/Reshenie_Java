package ru.spb.reshenie.javatasks.re;
import java.util.regex.*;
import java.util.*;
/*
Определить степень надежности пароля (цифры, большие и маленькие буквы - надежный, 2 из 3 - слабый, иначе - ненадежный)
 */
public class PasswordStrengthChecker {

    public static String checkPasswordStrength(String password) {
        int count = 0;

        Pattern digitPattern = Pattern.compile("\\d");
        Matcher digitMatcher = digitPattern.matcher(password);
        if (digitMatcher.find()) {
            count++;
        }
        Pattern uppercasePattern = Pattern.compile("[A-Z]");
        Matcher uppercaseMatcher = uppercasePattern.matcher(password);
        if (uppercaseMatcher.find()) {
            count++;
        }
        Pattern lowercasePattern = Pattern.compile("[a-z]");
        Matcher lowercaseMatcher = lowercasePattern.matcher(password);
        if (lowercaseMatcher.find()) {
            count++;
        }
        if (count == 3){
            return "Пароль надежный";
        } else if (count == 2) {
            return "Пароль слабый";
        } else {
            return "Пароль ненадежный";
        }
    }
}

