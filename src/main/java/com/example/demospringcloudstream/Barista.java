package com.example.demospringcloudstream;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

public interface Barista {
    @Input("orders")
    SubscribableChannel orders();
}