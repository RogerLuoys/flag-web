package com.luoys.upgrade.flagweb.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@EnableFeignClients(basePackages = {"com.luoys.upgrade.flagweb.web", "com.luoys.upgrade.flagweb.client"})
@SpringBootApplication
@ComponentScan(basePackages = "com.luoys.upgrade.flagweb.client")
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}