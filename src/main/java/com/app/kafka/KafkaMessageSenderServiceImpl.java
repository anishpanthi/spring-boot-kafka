package com.app.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

/**
 * @author Anish Panthi
 */
@Service
public class KafkaMessageSenderServiceImpl implements KafkaMessageSenderService{

    private KafkaTemplate<String, String> kafkaTemplate;

    @Value("${spring.kafka.template.default-topic:app-test}")
    private String topic;

    @Override
    public void sendMessage(String message){
        kafkaTemplate.send(topic, message);
    }

    @Autowired
    public KafkaMessageSenderServiceImpl(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
}
