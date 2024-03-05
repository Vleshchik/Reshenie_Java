package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.DateParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DateParserTest {
    @Test
    public void testParseTime_validFormat() {
        String time = "235959";
        String parsedTime = DateParser.parseTime(time);
        assertEquals("Parsed time (HHmmss): 23:59:59", parsedTime);
    }
    @Test
    public void testParseTime_invalidFormat() {
        String time = "256789";
        String parsedTime = DateParser.parseTime(time);
        assertEquals("Invalid time format", parsedTime);
    }
    @Test
    public void testParseDate1_validFormat() {
        String date1 = "311220";
        String parsedDate1 = DateParser.parseDate1(date1);
        assertEquals("Parsed date (ddMMyy): 31.12.20", parsedDate1);
    }
    @Test
    public void testParseDate1_invalidFormat() {
        String date1 = "321320";
        String parsedDate1 = DateParser.parseDate1(date1);
        assertEquals("Invalid date format", parsedDate1);
    }
    @Test
    public void testParseDate2_validFormat() {
        String date2 = "20211231235959";
        String parsedDate2 = DateParser.parseDate2(date2);
        assertEquals("Parsed date (yyyyMMddHHmmss): 31.12.2021 23:59:59", parsedDate2);
    }
    @Test
    public void testParseDate2_invalidFormat() {
        String date2 = "20211332245959";
        String parsedDate2 = DateParser.parseDate2(date2);
        assertEquals("Invalid date format", parsedDate2);
    }
}
