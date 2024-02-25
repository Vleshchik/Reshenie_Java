package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Реализовать простой консольный калькулятор (без скобок, операции: +,-,*,/,степень,логарифм,факториал)
public class SimpleCalculator {
    public static double logarithm(int base, int x) {
        return Math.log(x) / Math.log(base);
    }
    public static int factorial(int x){
        int result = 1;
        for (int i = 1; i <= x; i++) {
            result = result * i;
        }
        return result;
    }
    public static int calculator(String calc) {
        String[] act = calc.split("\\s+");
        if (act.length == 1 && act[0].charAt(0) == '!') {
            System.out.println(factorial(Integer.parseInt(act[0].substring(1).trim())));
        } else if (act[0].equals("log")) {
            System.out.println(logarithm(Integer.parseInt(act[1].trim()), Integer.parseInt(act[2].trim())));
        } else {
            switch (act[1]) {
                case "+":
                    return Integer.parseInt(act[0].trim()) + Integer.parseInt(act[2].trim());
                case "-":
                    return Integer.parseInt(act[0].trim()) - Integer.parseInt(act[2].trim());
                case "*":
                    return Integer.parseInt(act[0].trim()) * Integer.parseInt(act[2].trim());
                case "/":
                    return Integer.parseInt(act[0].trim()) / Integer.parseInt(act[2].trim());
                case "**":
                    return (int) Math.pow(Integer.parseInt(act[0].trim()), Integer.parseInt(act[2].trim()));
            }
        }
        return 0;
    }
}
