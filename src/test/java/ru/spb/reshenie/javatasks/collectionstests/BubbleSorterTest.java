package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.collections.BubbleSorter;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSorterTest {

    @Test
    public void testBubbleSort() {
        List<Integer> inputList = Arrays.asList(64, 34, 25, 12, 22, 11, 90);
        List<Integer> expectedSorted = Arrays.asList(11, 12, 22, 25, 34, 64, 90);

        BubbleSorter.bubbleSort(inputList);

        assertArrayEquals(expectedSorted.toArray(), inputList.toArray());
    }
}
