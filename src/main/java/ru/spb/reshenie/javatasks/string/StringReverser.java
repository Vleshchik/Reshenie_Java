package ru.spb.reshenie.javatasks.string;
//Развернуть строку
public class StringReverser {
    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
