package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.BracketPairChecker;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BracketPairCheckerTest {
    @Test
    public void testCheckParenthesesWithValidInput() {
        BracketPairChecker bracketpairchecker = new BracketPairChecker();
        assertTrue(bracketpairchecker.checkParentheses("(a+b)+[c-d]"));
    }

    @Test
    public void testCheckParentheses() {
        BracketPairChecker bracketpairchecker = new BracketPairChecker();
        assertFalse(bracketpairchecker.checkParentheses("((a+b)+[c-d]"));
        assertFalse(bracketpairchecker.checkParentheses("(a+b]+[c-d)"));
    }
}
