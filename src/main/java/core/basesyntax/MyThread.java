package core.basesyntax;

import java.time.LocalTime;
import java.util.Random;
import java.util.concurrent.Callable;

public class MyThread implements Callable<String> {
    @Override
    public String call() throws InterruptedException {
        Random rand = new Random();
        int waitTimeMs = (rand.nextInt(5) + 1) * 100;
        Thread.sleep(waitTimeMs);
        return String.format(
                "Task duration was %d ms, execution finished at %s",
                waitTimeMs,
                LocalTime.now()
        );
    }
}
