package com.eling.cloud.zuul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.eling", "org.ligson"})
@EnableFeignClients(basePackages = {"com.eling"})
@EnableScheduling
public class Application {
//gg
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class).run(args);
    }
}
