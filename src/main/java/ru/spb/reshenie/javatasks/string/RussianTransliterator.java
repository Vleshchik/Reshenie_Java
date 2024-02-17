package ru.spb.reshenie.javatasks.string;
import java.util.*;
//Перевести русский текст в транслит
public class RussianTransliterator {
    public static String transliterate(String text) {
        Map<Character, String> translitMap = createTranslitMap();
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (translitMap.containsKey(Character.toLowerCase(ch))) {
                if (Character.isUpperCase(ch)) {
                    result.append(translitMap.get(Character.toLowerCase(ch)).toUpperCase());
                } else {
                    result.append(translitMap.get(Character.toLowerCase(ch)));
                }
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    private static Map<Character, String> createTranslitMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('а', "a");
        map.put('б', "b");
        map.put('в', "v");
        map.put('г', "g");
        map.put('д', "d");
        map.put('е', "e");
        map.put('ё', "yo");
        map.put('ж', "zh");
        map.put('з', "z");
        map.put('и', "i");
        map.put('й', "yi");
        map.put('к', "k");
        map.put('л', "l");
        map.put('м', "m");
        map.put('н', "n");
        map.put('о', "o");
        map.put('п', "p");
        map.put('р', "r");
        map.put('с', "s");
        map.put('т', "t");
        map.put('у', "u");
        map.put('ф', "f");
        map.put('х', "kh");
        map.put('ц', "tc");
        map.put('ч', "ch");
        map.put('ш', "sh");
        map.put('щ', "shch");
        map.put('ъ', "'");
        map.put('ы', "y");
        map.put('ь', "\"");
        map.put('э', "e");
        map.put('ю', "yu");
        map.put('я', "ya");
        return map;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        System.out.println(transliterate(sentence));
    }
}


