package com.luoys.upgrade.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients(basePackages = { "com.guahao.cloudhis.web", "com.guahao.cloudhis.client" })
@ComponentScan("com.luoys.upgrade")
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
