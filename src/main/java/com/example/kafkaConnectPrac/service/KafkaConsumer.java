package com.example.kafkaConnectPrac.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {


    @KafkaListener(topics = "demo-topic", groupId = "my-consumer-group")
    public void listener(String message){
        System.out.println("Kafka Message in Consumer = "+message);
    }
}
