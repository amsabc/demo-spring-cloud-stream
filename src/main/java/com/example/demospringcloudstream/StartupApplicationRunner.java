package com.example.demospringcloudstream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationRunner implements ApplicationRunner {

    @Autowired
    private Barista barista;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Message<String> message = MessageBuilder.withPayload("test")
                                                .build();

        barista.orders()
               .send(message);
    }
//
//    @StreamListener("orders")
//    public void handle(String message) {
//        System.out.println(message);
//    }
}
