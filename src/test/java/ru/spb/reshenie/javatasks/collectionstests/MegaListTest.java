package ru.spb.reshenie.javatasks.collectionstests;

import org.junit.jupiter.api.Test;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.spb.reshenie.javatasks.collections.MegaList;

public class MegaListTest {
    @Test
    public void testFiltered() {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        inputList.add(4);
        MegaList<Integer> megaList = new MegaList<>(inputList);

        MegaList<Integer> filteredList = megaList.filtered(x -> x % 2 == 0);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(2);
        expectedList.add(4);

        assertEquals(expectedList, filteredList);
    }

    @Test
    public void testVisit() {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(1);
        inputList.add(2);
        inputList.add(3);
        MegaList<Integer> megaList = new MegaList<>(inputList);

        List<Integer> visitedList = new ArrayList<>();
        megaList.visit(visitedList::add);

        assertEquals(inputList, visitedList);
    }
}
