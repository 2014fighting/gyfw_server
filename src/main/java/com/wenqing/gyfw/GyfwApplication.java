package com.wenqing.gyfw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication

//启动时加载config.properties
@PropertySource("classpath:config.properties")
public class GyfwApplication {

    public static void main(String[] args) {
        SpringApplication.run(GyfwApplication.class, args);
    }
}
