package ru.spb.reshenie.javatasks.re;
import java.util.regex.*;
//Распарсить ax^2+b*x+c, вывести коэффициенты, найти корни
public class QuadraticEquationParser {
    public static String parseAndSolveQuadraticEquation(String equation) {
        Pattern pattern = Pattern.compile("(-?\\d*)[xX]\\^2([+-]\\d*)[xX]([+-]\\d+)?");
        Matcher matcher = pattern.matcher(equation);

        if (matcher.find()) {
            int a = parseCoefficient(matcher.group(1));
            int b = parseCoefficient(matcher.group(2));
            int c = parseCoefficient(matcher.group(3));

            double discriminant = b * b - 4 * a * c;

            if (discriminant > 0) {
                double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                return "Коэффициенты: a=" + a + ", b=" + b + ", c=" + c + ". Корни уравнения: x1=" + root1 + ", x2=" + root2;
            } else if (discriminant == 0) {
                double root = (double) -b / (2 * a);
                return "Коэффициенты: a=" + a + ", b=" + b + ", c=" + c + ". Уравнение имеет один корень: x=" + root;

            } else {
                return "Коэффициенты: a=" + a + ", b=" + b + ", c=" + c + ". Уравнение не имеет действительных корней.";

            }
        } else {
            return "Уравнение не соответствует формату ax^2+bx+c";
        }
    }
    public static int parseCoefficient(String coefficient) {
        if (coefficient == null || coefficient.equals("+") || coefficient.equals("-")) {
            return coefficient.startsWith("-") ? -1 : 1;
        }
        return Integer.parseInt(coefficient);
    }
}
