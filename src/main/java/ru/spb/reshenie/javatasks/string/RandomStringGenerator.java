package ru.spb.reshenie.javatasks.string;


import java.util.*;

//Сгенерировать случайную строку заданной длины
public class RandomStringGenerator {
    public static String generateString(int length){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder(length);
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }
        return sb.toString();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = generateString(n);
        System.out.println(word);
    }
}
