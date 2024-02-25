package ru.spb.reshenie.javatasks.re;
import java.util.Scanner;

//Убрать повторяющиеся пробелы
public class SpaceRemover {
    public static String removeExtraSpaces(String input) {

        return input.replaceAll("\\s+", " ");
    }
}
