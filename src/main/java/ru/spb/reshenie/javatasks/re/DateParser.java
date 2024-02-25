package ru.spb.reshenie.javatasks.re;
//Распарсить форматированную дату (HHmmss, ddMMyy, yyyyMMddHHmmss)
import java.util.regex.*;
import java.util.*;
public class DateParser {
    public static String parseTime(String formattedTime) {
        Pattern timePattern = Pattern.compile("([0-1][0-9]|2[0-3])([0-5][0-9])([0-5][0-9])");
        Matcher timeMatcher = timePattern.matcher(formattedTime);
        if (timeMatcher.matches()) {
            int hours = Integer.parseInt(timeMatcher.group(1));
            int minutes = Integer.parseInt(timeMatcher.group(2));
            int seconds = Integer.parseInt(timeMatcher.group(3));
            return "Parsed time (HHmmss): " + hours + ":" + minutes + ":" + seconds;
        }
        return "Invalid time format";
    }

    public static String parseDate1(String formattedDate) {
        Pattern datePattern1 = Pattern.compile("([0-2][0-9]|[0-3][0-1])(0[0-9]|1[0-2])([0-9]{2})");
        Matcher dateMatcher = datePattern1.matcher(formattedDate);
        if (dateMatcher.matches()) {
            int day = Integer.parseInt(dateMatcher.group(1));
            int month = Integer.parseInt(dateMatcher.group(2));
            int year = Integer.parseInt(dateMatcher.group(3));
            return "Parsed date (ddMMyy): " + day + "." + month + "." + year;
        }
        return "Invalid date format";
    }

    public static String parseDate2(String formattedDate) {
        Pattern datePattern2 = Pattern.compile("([0-1]\\d{3}|20[0-2][0-4])(0[0-9]|1[0-2])([0-2][0-9]|[0-3][0-1])([0-1][0-9]|2[0-3])([0-5][0-9])([0-5][0-9])");
        Matcher dateMatcher = datePattern2.matcher(formattedDate);
        if (dateMatcher.matches()) {
            int year = Integer.parseInt(dateMatcher.group(1));
            int month = Integer.parseInt(dateMatcher.group(2));
            int day = Integer.parseInt(dateMatcher.group(3));
            int hours = Integer.parseInt(dateMatcher.group(4));
            int minutes = Integer.parseInt(dateMatcher.group(5));
            int seconds = Integer.parseInt(dateMatcher.group(6));
            return "Parsed date (yyyyMMddHHmmss): " + day + "." + month + "." + year + " " + hours + ":" + minutes + ":" + seconds;
        }
        return "Invalid date format";
    }
}
