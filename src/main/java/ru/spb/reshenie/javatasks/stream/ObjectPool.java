package ru.spb.reshenie.javatasks.stream;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;



class ObjectPool {
    private BlockingQueue<PooledObject> pool;

    public ObjectPool(int size) {
        pool = new ArrayBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            pool.add(new PooledObject("Object " + i));
        }
    }

    public PooledObject getObject() throws InterruptedException {
        return pool.take();
    }

    public void releaseObject(PooledObject obj) {
        pool.offer(obj);
    }
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool(5);

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(() -> {
                try {
                    PooledObject obj = objectPool.getObject();
                    System.out.println(Thread.currentThread().getName() + " got " + obj.getData());
                    Thread.sleep(2000);
                    objectPool.releaseObject(obj);
                    System.out.println(Thread.currentThread().getName() + " released " + obj.getData());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            thread.start();
        }
    }
}
