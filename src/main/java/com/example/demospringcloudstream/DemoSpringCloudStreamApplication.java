package com.example.demospringcloudstream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

@SpringBootApplication
@EnableBinding(Barista.class)
public class DemoSpringCloudStreamApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringCloudStreamApplication.class, args);
    }
}
