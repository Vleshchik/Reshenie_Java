package ru.spb.reshenie.javatasks.re;
//Форматировать текущую дату (HHmmss, ddMMyy, yyyyMMddHHmmss)

import java.time.*;
import java.time.format.*;
public class DateFormatter {
    public static String formatDateTime(String pattern) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern));
    }
}
