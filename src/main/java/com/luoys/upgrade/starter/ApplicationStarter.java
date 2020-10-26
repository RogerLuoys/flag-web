package com.luoys.upgrade.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = {"com.luoys.upgrade.flagweb", "com.luoys.upgrade.client"})
@SpringBootApplication
@ComponentScan("com.luoys.upgrade")
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
