package ru.spb.reshenie.javatasks.streamtests;
import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.stream.ObjectPoolThread;
import java.util.concurrent.CountDownLatch;

public class ObjectPoolThreadTest {
    @Test
    void testStartThreads() throws InterruptedException {
        ObjectPoolThread objectPoolThread = new ObjectPoolThread();
        objectPoolThread.startThreads();

        CountDownLatch latch = new CountDownLatch(10);
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    latch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }

        latch.await(); // Ждем, пока все потоки завершат выполнение
    }
}
