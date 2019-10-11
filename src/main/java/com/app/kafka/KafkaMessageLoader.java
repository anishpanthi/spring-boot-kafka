package com.app.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

/**
 * @author Anish Panthi
 */
@Configuration
public class KafkaMessageLoader implements CommandLineRunner {

    private KafkaMessageSenderService kafkaMessageSenderService;

    @Override
    public void run(String... args) throws Exception {
        kafkaMessageSenderService.sendMessage("Bingo! You did it :)");
    }

    @Autowired
    public KafkaMessageLoader(KafkaMessageSenderService kafkaMessageSenderService){
        this.kafkaMessageSenderService = kafkaMessageSenderService;
    }
}
