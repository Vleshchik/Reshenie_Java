package ru.spb.reshenie.javatasks.streamtests;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ru.spb.reshenie.javatasks.stream.ObjectPool;
public class ObjectPoolTest {
    @Test
    void testObjectPool() throws InterruptedException {
        ObjectPool objectPool = new ObjectPool(3);

        String obj1 = objectPool.getObject();
        String obj2 = objectPool.getObject();
        String obj3 = objectPool.getObject();

        assertEquals(0, objectPool.pool.size()); // Пул пустой после извлечения трех объектов

        objectPool.releaseObject(obj1);
        objectPool.releaseObject(obj2);
        objectPool.releaseObject(obj3);

        assertEquals(3, objectPool.pool.size()); // Пул снова содержит три объекта
    }
}