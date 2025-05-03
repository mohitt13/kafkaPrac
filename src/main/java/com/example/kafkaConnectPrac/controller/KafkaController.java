package com.example.kafkaConnectPrac.controller;

import com.example.kafkaConnectPrac.service.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    KafkaProducer kafkaProducer;

    @PostMapping("/sendMsgToKafka")
    public ResponseEntity<String> helloWorld(){
        kafkaProducer.sendMessage("Hello Mohit - From Kafka!");
        return ResponseEntity.ok("Message Sent!");
    }
}
