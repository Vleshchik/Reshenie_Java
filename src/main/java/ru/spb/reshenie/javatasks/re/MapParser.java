package ru.spb.reshenie.javatasks.re;
//Распарсить мапу по формату "KEY1=VAL1\nKEY2=VAL2"
import java.util.*;
import java.util.regex.*;
public class MapParser {
    public static Map<String, String> parseMap(String input) {
        Map<String, String> resultMap = new HashMap<>();

        Pattern pattern = Pattern.compile("(\\w+)=(\\w+)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String key = matcher.group(1);
            String value = matcher.group(2);
            resultMap.put(key, value);
        }

        return resultMap;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Map<String, String> resultMap = parseMap(input);
        for (Map.Entry<String, String> entry : resultMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

}
