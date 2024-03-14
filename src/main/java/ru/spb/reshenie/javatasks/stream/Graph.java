package ru.spb.reshenie.javatasks.stream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class Graph {
    public void printGraph(String s) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        String graph = s;
        for (char c : graph.toCharArray()) {
            executor.schedule(() -> System.out.print(c), 1, TimeUnit.SECONDS);
        }

        executor.shutdown();
    }
}
