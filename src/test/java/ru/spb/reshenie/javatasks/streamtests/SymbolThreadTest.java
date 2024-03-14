package ru.spb.reshenie.javatasks.streamtests;

import org.junit.jupiter.api.Test;
import ru.spb.reshenie.javatasks.stream.SymbolThread;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SymbolThreadTest {
    @Test
    void testSymbolThread() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SymbolThread symbolThread = new SymbolThread('A', 3);
        Thread thread = new Thread(symbolThread);
        thread.start();

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.setOut(System.out); // Восстанавливаем стандартный поток вывода

        assertEquals("AAA", outContent.toString().trim());
    }
}
