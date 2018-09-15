package me.peyppicp;

import com.alibaba.boot.dubbo.autoconfigure.DubboAutoConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

import java.util.concurrent.CountDownLatch;

/**
 * Hello world!
 */
@SpringBootApplication(exclude = DubboAutoConfiguration.class)
@ImportResource({"classpath:dubbo/dubbo.xml"})
public class ApiProviderApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiProviderApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);
        try {
            new CountDownLatch(1).await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
