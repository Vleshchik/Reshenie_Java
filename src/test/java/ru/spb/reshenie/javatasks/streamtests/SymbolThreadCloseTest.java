package ru.spb.reshenie.javatasks.streamtests;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.spb.reshenie.javatasks.stream.SymbolThreadClose;
public class SymbolThreadCloseTest {
    @Test
    void testSymbolThreadClose() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        SymbolThreadClose symbolThread = new SymbolThreadClose('X', 5);
        Thread thread = new Thread(symbolThread);
        thread.start();

        try {
            Thread.sleep(2000);
            symbolThread.stop(); // Останавливаем поток
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.setOut(System.out); // Восстанавливаем стандартный поток вывода

        assertEquals("XXX", outContent.toString().trim());
    }
}
