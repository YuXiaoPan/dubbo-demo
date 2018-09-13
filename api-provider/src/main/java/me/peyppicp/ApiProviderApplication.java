package me.peyppicp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo.xml"})
public class ApiProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiProviderApplication.class, args);
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
