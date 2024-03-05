package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.StringValidator;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTest {
    @Test
    public void testCheckPositiveNumber() {
        assertTrue(StringValidator.checkPositiveNumber("123"));
        assertTrue(StringValidator.checkPositiveNumber("123.456"));
        assertFalse(StringValidator.checkPositiveNumber("-123"));
        assertFalse(StringValidator.checkPositiveNumber("abc"));
    }
    @Test
    public void testCheckIntegerNumber() {
        assertTrue(StringValidator.checkIntegerNumber("123"));
        assertTrue(StringValidator.checkIntegerNumber("-123"));
        assertFalse(StringValidator.checkIntegerNumber("123.456"));
        assertFalse(StringValidator.checkIntegerNumber("abc"));
    }
    @Test
    public void testCheckDecimalNumber() {
        assertTrue(StringValidator.checkDecimalNumber("123.456"));
        assertTrue(StringValidator.checkDecimalNumber("-123.456"));
        assertFalse(StringValidator.checkDecimalNumber("123"));
        assertFalse(StringValidator.checkDecimalNumber("abc"));
    }
    @Test
    public void testCheckComplexNumber() {
        assertTrue(StringValidator.checkComplexNumber("123+456i"));
        assertTrue(StringValidator.checkComplexNumber("-123.456e-78+789.012i"));
        assertFalse(StringValidator.checkComplexNumber("123"));
        assertFalse(StringValidator.checkComplexNumber("abc"));
    }
    @Test
    public void testCheckValidIPAddress() {
        assertTrue(StringValidator.checkValidIPAddress("192.168.0.1"));
        assertTrue(StringValidator.checkValidIPAddress("255.255.255.0"));
        assertFalse(StringValidator.checkValidIPAddress("256.168.0.1"));
        assertFalse(StringValidator.checkValidIPAddress("192.168.0.256"));
    }
    @Test
    public void testCheckValidMACAddress() {
        assertTrue(StringValidator.checkValidMACAddress("00:1A:C2:7B:00:47"));
        assertTrue(StringValidator.checkValidMACAddress("00-1A-C2-7B-00-47"));
        assertFalse(StringValidator.checkValidMACAddress("00:1A:C2:7B:00"));
        assertFalse(StringValidator.checkValidMACAddress("00:1A:C2:7B:00:47:00"));
    }
    @Test
    public void testCheckValidGUID() {
        assertTrue(StringValidator.checkValidGUID("{e02fd0e4-00fd-090A-ca30-0d00a0038ba0}"));
        assertTrue(StringValidator.checkValidGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0"));
        assertFalse(StringValidator.checkValidGUID("e02fd0e4-00fd-090A-0d00a0038ba0"));
        assertFalse(StringValidator.checkValidGUID("e02fd0e4-00fd-090A-ca30-0d00a0038ba0-"));
    }
}
