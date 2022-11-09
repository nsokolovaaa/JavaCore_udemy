package Concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class SequenceGenerator {
    private AtomicInteger number = new AtomicInteger();

    public int generate() throws InterruptedException {
        Thread.sleep(200);
        return number.incrementAndGet();
    }

}

