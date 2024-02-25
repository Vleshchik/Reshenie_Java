package ru.spb.reshenie.javatasks.re;
//Заменить в строке шаблон $DATE{ddMMyyyy} на текущую дату в соответствующем формате
import java.util.Scanner;
import java.util.regex.*;
import java.time.*;
import java.time.format.*;
public class DateTemplateReplacer {
    public static String replaceDatePlaceholder(String input) {
        Pattern pattern = Pattern.compile("\\$DATE\\{ddMMyyyy\\}");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("ddMMyyyy"));
            input = input.replace(matcher.group(), currentDate);
        }
        return input;
    }
}
