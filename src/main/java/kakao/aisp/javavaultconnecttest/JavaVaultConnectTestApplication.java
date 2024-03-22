package kakao.aisp.javavaultconnecttest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class JavaVaultConnectTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaVaultConnectTestApplication.class, args);
    }

}
