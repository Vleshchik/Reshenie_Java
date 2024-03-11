package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.collections.ListComparator;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ListComparatorTest {
        @Test
        public void testCompareLists() {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
            List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
            double result = ListComparator.compareLists(list1, list2);
            assertEquals(60.0, result, 0.01);
        }
}
