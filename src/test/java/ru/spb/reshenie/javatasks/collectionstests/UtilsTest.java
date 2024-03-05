package ru.spb.reshenie.javatasks.collectionstests;
import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
import ru.spb.reshenie.javatasks.collections.Utils;


public class UtilsTest {
    @Test
    public void testCastCollection() {
        List<Object> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add("2");
        inputList.add(3);

        Collection<Integer> result = Utils.castCollection(inputList, Integer.class);

        assertEquals(2, result.size());
        assertEquals(1, result.toArray()[0]);
        assertEquals(3, result.toArray()[1]);
    }
}