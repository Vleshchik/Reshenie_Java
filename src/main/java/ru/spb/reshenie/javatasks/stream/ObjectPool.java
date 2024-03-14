package ru.spb.reshenie.javatasks.stream;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ObjectPool {
    public final BlockingQueue<String> pool;

    public ObjectPool(int size) {
        pool = new LinkedBlockingQueue<>(size);
        for (int i = 0; i < size; i++) {
            pool.add("Object" + i);
        }
    }

    public String getObject() throws InterruptedException {
        return pool.take(); // Блокирующий вызов, ждет, пока не появится свободный объект
    }

    public void releaseObject(String obj) throws InterruptedException {
        pool.put(obj); // Освобождение объекта и добавление его обратно в пул
    }
}
