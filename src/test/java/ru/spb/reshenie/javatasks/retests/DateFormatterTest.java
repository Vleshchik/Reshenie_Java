package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.DateFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static junit.framework.Assert.assertEquals;

public class DateFormatterTest {
    @Test
    public void testFormatDateTime() {
        LocalDateTime now = LocalDateTime.now();
        String HHmmss = now.format(DateTimeFormatter.ofPattern("HHmmss"));
        String ddMMyy = now.format(DateTimeFormatter.ofPattern("ddMMyy"));
        String yyyyMMddHHmmss = now.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmss"));

        Assertions.assertEquals(HHmmss, DateFormatter.formatDateTime("HHmmss"));
        Assertions.assertEquals(ddMMyy, DateFormatter.formatDateTime("ddMMyy"));
        Assertions.assertEquals(yyyyMMddHHmmss, DateFormatter.formatDateTime("yyyyMMddHHmmss"));
    }
}
