package ru.spb.reshenie.javatasks.files;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
/*
Реализовать сериализуемую мапу с форматом "KEY1=VAL1\nKEY2=:VAL2:VAL3:":
- файл задается в конструкторе
- метод load читает файл в мапу, метод save наоборот
- если значение содержит ':', то это список
 */
public class SerializableMap {
    private Map<String, String> map;
    private File file;

    public SerializableMap(File file) {
        this.file = file;
        this.map = new HashMap<>();
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("=");
                if (parts.length > 1) {
                    map.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.write(entry.getKey() + "=" + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public String get(String key) {
        return map.get(key);
    }
}