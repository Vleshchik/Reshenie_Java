package ru.spb.reshenie.javatasks.re;
//Распарсить форматированную дату (HHmmss, ddMMyy, yyyyMMddHHmmss)
import java.util.regex.*;
import java.util.*;
public class DateParser {
    public static void parseTime(String formattedTime) {
        Pattern timePattern = Pattern.compile("([0-2][0-9])([0-5][0-9])([0-5][0-9])");
        Matcher timeMatcher = timePattern.matcher(formattedTime);
        if (timeMatcher.matches()) {
            int hours = Integer.parseInt(timeMatcher.group(1));
            int minutes = Integer.parseInt(timeMatcher.group(2));
            int seconds = Integer.parseInt(timeMatcher.group(3));
            System.out.println("Parsed time (HHmmss): " + hours + ":" + minutes + ":" + seconds);
        }
    }

    public static void parseDate1(String formattedDate) {
        Pattern datePattern1 = Pattern.compile("([0-3][0-9])([0-1][0-9])([0-9]{2})");
        Matcher dateMatcher = datePattern1.matcher(formattedDate);
        if (dateMatcher.matches()) {
            int day = Integer.parseInt(dateMatcher.group(1));
            int month = Integer.parseInt(dateMatcher.group(2));
            int year = Integer.parseInt(dateMatcher.group(3));
            System.out.println("Parsed date (ddMMyy): " + day + "." + month + "." + year);
        }
    }

    public static void parseDate2(String formattedDate) {
        Pattern datePattern2 = Pattern.compile("(\\d{4})(\\d{2})(\\d{2})(\\d{2})(\\d{2})(\\d{2})");
        Matcher dateMatcher = datePattern2.matcher(formattedDate);
        if (dateMatcher.matches()) {
            int year = Integer.parseInt(dateMatcher.group(1));
            int month = Integer.parseInt(dateMatcher.group(2));
            int day = Integer.parseInt(dateMatcher.group(3));
            int hours = Integer.parseInt(dateMatcher.group(4));
            int minutes = Integer.parseInt(dateMatcher.group(5));
            int seconds = Integer.parseInt(dateMatcher.group(6));
            System.out.println("Parsed date (yyyyMMddHHmmss): " + day + "." + month + "." + year + " " + hours + ":" + minutes + ":" + seconds);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите время в формате :");
        String formattedTime = scanner.nextLine();
        System.out.println("Введите дату в формате:");
        String formattedDate1 = scanner.nextLine();
        System.out.println("Введите дату в формате:");
        String formattedDate2 = scanner.nextLine();


        parseTime(formattedTime);
        parseDate1(formattedDate1);
        parseDate2(formattedDate2);
    }
}
