package ru.spb.reshenie.javatasks.streamtests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.stream.Graph;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GraphTest {

    @Test
    public void testPrintGraph() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Graph graph = new Graph();
        graph.printGraph("acacadadeeeeefbfb...fbxxx");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.setOut(System.out);

        assertEquals("acacadadeeeeefbfb...fbxxx", outContent.toString().trim());
    }
}
