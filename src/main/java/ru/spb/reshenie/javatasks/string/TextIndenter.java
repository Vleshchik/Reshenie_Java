package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Добавить в текст отступы с каждой новой строки 4 пробела
public class TextIndenter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        StringBuilder inputText = new StringBuilder();
        System.out.println("Введите текст (для завершения ввода введите пустую строку):");
        String line;
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            inputText.append("    ").append(line).append("\n");
        }
        System.out.println(inputText);

    }
}
