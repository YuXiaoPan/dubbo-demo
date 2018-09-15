package me.peyppicp.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 */
@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo.xml"})
public class ApiConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiConsumerApplication.class, args);
    }
}
