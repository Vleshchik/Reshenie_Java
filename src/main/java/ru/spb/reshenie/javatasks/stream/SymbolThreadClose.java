package ru.spb.reshenie.javatasks.stream;

public class SymbolThreadClose implements Runnable {

        private char symbol;
        private int count;
        private volatile boolean running = true;

        public SymbolThreadClose(char symbol, int count) {
            this.symbol = symbol;
            this.count = count;
        }

        public void stop() {
            running = false;
        }

        @Override
        public void run() {
            for (int i = 0; i < count && running; i++) {
                System.out.print(symbol);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }



        public static void main(String[] args) {
            SymbolThreadClose symbolThread = new SymbolThreadClose('*', 5);
            Thread thread = new Thread(symbolThread);
            thread.start();

            // Завершение потока через 3 секунды
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            symbolThread.stop();
        }

}
