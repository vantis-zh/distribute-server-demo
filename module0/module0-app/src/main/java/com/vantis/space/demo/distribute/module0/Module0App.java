package com.vantis.space.demo.distribute.module0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.vantis.space.demo.distribute")
public class Module0App {
    public static void main(String[] args) {
        SpringApplication.run(Module0App.class, args);
    }
}
