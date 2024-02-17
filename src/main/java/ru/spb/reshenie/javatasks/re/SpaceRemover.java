package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;

//Убрать повторяющиеся пробелы
public class SpaceRemover {
    public static String removeExtraSpaces(String input) {

        return input.replaceAll("\\s+", " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(removeExtraSpaces(input));
    }
}
