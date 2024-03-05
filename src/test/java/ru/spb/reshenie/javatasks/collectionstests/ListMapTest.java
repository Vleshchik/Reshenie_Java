package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.spb.reshenie.javatasks.collections.ListMap;

public class ListMapTest {

    @Test
    public void testPutAndGet() {
        ListMap<String, Integer> listMap = new ListMap<>();

        listMap.put("A", 1);
        listMap.put("A", 2);
        listMap.put("B", 3);

        List<Integer> listA = listMap.get("A");
        List<Integer> listB = listMap.get("B");
        List<Integer> listC = listMap.get("C");

        List<Integer> expectedListA = new ArrayList<>();
        expectedListA.add(1);
        expectedListA.add(2);
        List<Integer> expectedListB = new ArrayList<>();
        expectedListB.add(3);

        assertEquals(expectedListA, listA);
        assertEquals(expectedListB, listB);
        assertEquals(null, listC);
    }
}