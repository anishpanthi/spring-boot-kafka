package com.app.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

@SpringBootApplication
@Slf4j
public class SpringBootKafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootKafkaApplication.class, args);
    }

    @KafkaListener(topics = "app-test", groupId = "app")
    public void listenKafka(String message){
        log.info("Message Received: {}", message);
    }
}
