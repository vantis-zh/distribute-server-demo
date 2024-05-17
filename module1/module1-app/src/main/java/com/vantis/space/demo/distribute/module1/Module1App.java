package com.vantis.space.demo.distribute.module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.vantis.space.demo.distribute")
public class Module1App {
    public static void main(String[] args) {
        SpringApplication.run(Module1App.class, args);
    }
}
