package ru.spb.reshenie.javatasks.re;
import java.util.*;
import java.util.regex.*;
//Найти и выделить жирным (<b></b>) повтряющиеся пункты в html-списке.
public class RepeatedListItemTagger {
    public static String highlightRepeatedItems(String input) {
        Pattern pattern = Pattern.compile("<li>(.*?)</li>");
        Matcher matcher = pattern.matcher(input);

        Set<String> seenItems = new HashSet<>();
        StringBuffer result = new StringBuffer();
        while (matcher.find()) {
            String currentItem = matcher.group(1);
            if (seenItems.contains(currentItem)) {
                matcher.appendReplacement(result, "<b>" + currentItem + "</b>");
            } else {
                seenItems.add(currentItem);
                matcher.appendReplacement(result, "<li>" + currentItem + "</li>");
            }
        }
        matcher.appendTail(result);
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String htmlList = sc.nextLine(); //"<ul><li>Apple</li><li>Apple</li><li>Orange</li><li>Banana</li><li>Orange</li></ul>";
        String formattedList = highlightRepeatedItems(htmlList);
        System.out.println(formattedList);
    }
}
