package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.collections.CollectionIntersection;

import java.util.*;

import static junit.framework.Assert.assertEquals;

public class CollectionIntersectionTest {
    @Test
    public void testFindIntersection() {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5, 6, 7));

        Set<Integer> intersection = CollectionIntersection.findIntersection(set1, set2);

        Set<Integer> expectedIntersection = new HashSet<>(Arrays.asList(3, 4, 5));
        assertEquals(expectedIntersection, intersection);
    }
}
