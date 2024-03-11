package ru.spb.reshenie.javatasks.stream;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public class graph {
    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

        String graph = "acacadadeeeeefbfb...fbxxx";
        for (char c : graph.toCharArray()) {
            executor.schedule(() -> System.out.print(c), 1, TimeUnit.SECONDS);
        }

        executor.shutdown();
    }
}
