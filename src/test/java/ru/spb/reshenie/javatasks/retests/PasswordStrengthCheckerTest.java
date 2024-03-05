package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.PasswordStrengthChecker;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordStrengthCheckerTest {
    @Test
    public void testCheckPasswordStrength_strongPassword() {
        String password = "AbcDe123";
        String expected = "Пароль надежный";
        String result = PasswordStrengthChecker.checkPasswordStrength(password);
        assertEquals(expected, result);
    }
    @Test
    public void testCheckPasswordStrength_weakPassword() {
        String password = "abcDEF";
        String expected = "Пароль слабый";
        String result = PasswordStrengthChecker.checkPasswordStrength(password);
        assertEquals(expected, result);
    }
    @Test
    public void testCheckPasswordStrength_unreliablePassword() {
        String password = "12345";
        String expected = "Пароль ненадежный";
        String result = PasswordStrengthChecker.checkPasswordStrength(password);
        assertEquals(expected, result);
    }
}
