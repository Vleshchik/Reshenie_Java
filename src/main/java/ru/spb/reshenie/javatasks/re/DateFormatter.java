package ru.spb.reshenie.javatasks.re;
//Форматировать текущую дату (HHmmss, ddMMyy, yyyyMMddHHmmss)

import java.time.*;
import java.time.format.*;
public class DateFormatter {
    public static void main(String[] args) {
        // Форматирование в формат HHmmss
        String formattedTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HHmmss"));
        System.out.println("Formatted time (HHmmss): " + formattedTime);

        // Форматирование в формат ddMMyy
        String formattedDate1 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyy"));
        System.out.println("Formatted date (ddMMyy): " + formattedDate1);

        // Форматирование в формат yyyyMMddHHmmss
        String formattedDate2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));
        System.out.println("Formatted date (yyyyMMddHHmmss): " + formattedDate2);
    }
}
