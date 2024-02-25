package ru.spb.reshenie.javatasks.collections;
//Реализовать мапу списков - ListMap<K, V>, K - тип ключа, V - тип элементов списка
import java.util.*;
public class ListMap<K, V> {
    private Map<K, List<V>> map = new HashMap<>();

    public void put(K key, V value) {
        map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
    }

    public List<V> get(K key) {
        return map.get(key);
    }
}
