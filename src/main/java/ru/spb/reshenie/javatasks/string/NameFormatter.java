package ru.spb.reshenie.javatasks.string;

import java.util.*;

//Скорректировать регистр у ФИО + вывести инициалы (иванов ИВАН иВаНович -> Иванов Иван Иванович, Иванов И.И.)
public class NameFormatter
{

    public static String formatName(String fullName) {
        String[] names = fullName.split(" ");
        StringBuilder formattedName = new StringBuilder();
        for (String name : names) {
            formattedName.append(name.substring(0, 1).toUpperCase()).append(name.substring(1).toLowerCase()).append(" ");
        }
        return formattedName.toString().trim();
    }

    public static String getInitials(String fullName) {
        String[] names = fullName.split(" ");
        StringBuilder initials = new StringBuilder();
        initials.append(names[0].substring(0, 1).toUpperCase()).append(names[0].substring(1).toLowerCase()).append(" ");
        for (int i = 1; i <= names.length - 1; i++) {
            initials.append(names[i].substring(0, 1).toUpperCase()).append(".");
        }
        return initials.toString();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String fio = sc.nextLine();
        System.out.println(formatName(fio));
        System.out.println(getInitials(fio));

    }
}
