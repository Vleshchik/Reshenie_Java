package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Посчитать количество строк в тексте
public class LineCountCalculator {
    public static int countLines(String t) {
        String[] lines = t.split("\\n");
        return lines.length;
    }
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
            inputText.append(line).append("\n");
        }
        System.out.println(countLines(inputText.toString()));

    }
}
