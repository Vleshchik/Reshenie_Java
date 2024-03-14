package ru.spb.reshenie.javatasks.stream;

public class SymbolThread implements Runnable {
    private char symbol;
    private int count;
    public SymbolThread(char symbol, int count) {
        this.symbol = symbol;
        this.count = count;
    }
    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.print(symbol);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}