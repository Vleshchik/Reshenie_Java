package ru.spb.reshenie.javatasks.string;

import java.util.Scanner;

//Развернуть строку
public class StringReverser {

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
}
