package ru.spb.reshenie.javatasks.re;
import java.util.*;
//Преобразовать Markdown список в html
public class ConverterOfMarkdownListToHtml {
    public static String convertMarkdownListToHtml(String input) {
        String[] points = input.split("\\\\n");
        // Преобразование элементов списка в теги <li>

        StringBuilder htmlList = new StringBuilder("<ul>");
        for (String point : points){
            System.out.println(point);
            String s = point.replaceAll("\\*\\s+","");

            htmlList.append("<li>").append(s).append("</li>");
        }
        htmlList.append("</ul>");

        return htmlList.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String markdownList = sc.nextLine(); //* Item 1\n* Item 2\n* Item 3
        System.out.println(convertMarkdownListToHtml(markdownList));
    }
}
