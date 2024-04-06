package kakao.aisp.javavaultconnecttest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

@SpringBootTest
public class VirtualThreadTest {

    @Test
    public void call() {
        CompletableFuture.supplyAsync(() -> 10)
                .thenCombine(CompletableFuture.supplyAsync(() -> 5), (r1, r2) -> (r1 + r2) * 2)
                .thenAccept(r -> System.out.println("Combined and Transformed Result: " + r))
                .exceptionally(ex -> {
                    System.err.println("An exception occurred: " + ex.getMessage());
                    return null; // Return a default value or handle the exception as needed
                });
    }

    @Test
    public void vt() {
        long start = System.currentTimeMillis();

        try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {
            IntStream.range(0, 10_000).forEach(i -> {
                executor.submit(() -> {
                    Thread.sleep(Duration.ofSeconds(1));
                    return i;
                });
            });
        }

        long end = System.currentTimeMillis();

        System.out.println("time = " + (end - start));
    }

    @Test
    public void vt2() throws InterruptedException {
        long start = System.currentTimeMillis();

        Thread.Builder builder = Thread.ofVirtual().name("MyThread");
        Runnable task = () -> {
            System.out.println("Running thread");
        };
        Thread t = builder.start(task);
        System.out.println("Thread t name: " + t.getName());
        t.join();

        long end = System.currentTimeMillis();

        System.out.println("time = " + (end - start));
    }

}
