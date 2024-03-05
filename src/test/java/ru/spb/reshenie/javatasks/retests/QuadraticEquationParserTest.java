package ru.spb.reshenie.javatasks.retests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.re.QuadraticEquationParser;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuadraticEquationParserTest {
    @Test
    public void testParseAndSolveQuadraticEquation_validEquation() {
        String equation = "2x^2+3x-2";
        String expected = "Коэффициенты: a=2, b=3, c=-2. Корни уравнения: x1=0.5, x2=-2.0";
        String result = QuadraticEquationParser.parseAndSolveQuadraticEquation(equation);
        assertEquals(expected, result);
    }
}
