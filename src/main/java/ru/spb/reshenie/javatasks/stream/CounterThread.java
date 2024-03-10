package ru.spb.reshenie.javatasks.stream;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class CounterThread implements Runnable {
    private int count;
    private int interval;

    public CounterThread(int count, int interval) {
        this.count = count;
        this.interval = interval;
    }

    @Override
    public void run() {
        for (int i = 0; i < count; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(interval);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ScheduledExecutorService executor = Executors.newScheduledThreadPool(3);
        executor.scheduleAtFixedRate(new CounterThread(10, 1000), 0, 2, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new CounterThread(5, 1500), 0, 3, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(new CounterThread(8, 1200), 0, 4, TimeUnit.SECONDS);
    }
}