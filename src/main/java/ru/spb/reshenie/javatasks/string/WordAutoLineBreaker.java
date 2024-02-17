package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Автоперенос слов на новую строку по заданной максимальной ширине строки
public class WordAutoLineBreaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите текст:");
        String text = scanner.nextLine();

        System.out.println("Введите максимальную длину строки:");
        int maxLength = scanner.nextInt();

        for (int i = 0; i < text.length(); i += maxLength) {
            if (i + maxLength < text.length()) {
                System.out.println(text.substring(i, i + maxLength));
            } else {
                System.out.println(text.substring(i));
            }
        }
    }
}
