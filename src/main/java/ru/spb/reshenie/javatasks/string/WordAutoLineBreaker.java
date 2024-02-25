package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Автоперенос слов на новую строку по заданной максимальной ширине строки
public class WordAutoLineBreaker {
    public static String autoLineBreak(String text, int maxLength) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i += maxLength) {
            int end = Math.min(i + maxLength, text.length());
            result.append(text, i, end).append("\n");
        }
        return result.toString();
    }
}
