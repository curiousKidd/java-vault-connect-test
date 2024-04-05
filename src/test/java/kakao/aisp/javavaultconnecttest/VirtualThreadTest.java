package kakao.aisp.javavaultconnecttest;

import org.springframework.boot.test.context.SpringBootTest;

import java.util.concurrent.CompletableFuture;

@SpringBootTest
public class VirtualThreadTest {

    public void call() {
        CompletableFuture.supplyAsync(() -> 10)
                .thenCombine(CompletableFuture.supplyAsync(() -> 5), (r1, r2) -> (r1 + r2) * 2)
                .thenAccept(r -> System.out.println("Combined and Transformed Result: " + r))
                .exceptionally(ex -> {
                    System.err.println("An exception occurred: " + ex.getMessage());
                    return null; // Return a default value or handle the exception as needed
                });
    }

}
