package com.thecoderstv.embarx_producer.controller;

import com.thecoderstv.embarx_producer.RiderLocation;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class KafkaProducer {

    private final KafkaTemplate<String, RiderLocation> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, RiderLocation> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    // sending normal string
    /*
    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        kafkaTemplate.send("my-topic-new", message); // message will be send to this topic
        return "Message Sent  :: " +message;
    }
    */

    // sending objects to kafka topic
    @PostMapping("/send")
    public String sendMessage(@RequestParam String message) {
        RiderLocation riderLocation = new RiderLocation("rider101",10101.11,122323.4444);
        kafkaTemplate.send("my-topic-new", riderLocation); // message will be send to this topic
        return "Rider Location  :: " + riderLocation.getRiderId();
    }


}
