package ru.spb.reshenie.javatasks.streamtests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.stream.CounterThread;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class CounterThreadTest {

    @Test
    public void testCounterThread() {
        CounterThread counterThread = new CounterThread(5, 100);
        assertDoesNotThrow(() -> {
            Thread thread = new Thread(counterThread);
            thread.start();
            thread.join();
        });
    }
}