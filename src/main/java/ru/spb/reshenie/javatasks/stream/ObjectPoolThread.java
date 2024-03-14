package ru.spb.reshenie.javatasks.stream;

public class ObjectPoolThread {
    public void startThreads() {
        ObjectPool objectPool = new ObjectPool(5);

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                try {
                    String obj = objectPool.getObject();
                    System.out.println(Thread.currentThread().getName() + " got object: " + obj);
                    Thread.sleep((long) (Math.random() * 1000));
                    objectPool.releaseObject(obj);
                    System.out.println(Thread.currentThread().getName() + " released object: " + obj);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
