package com.thecoderstv.embarx_consumer.component;

import com.thecoderstv.embarx_consumer.RiderLocation;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {
    @KafkaListener(topics = "my-topic",groupId = "my-new-group")
    public void listen1(String message) {
        System.out.println("Received Message 1: " + message);
    }

    @KafkaListener(topics = "my-topic",groupId = "my-new-group-1")
    public void listen2(String message) {
        System.out.println("Received Message 2: " + message);
    }

    @KafkaListener(topics = "my-topic-new",groupId = "my-new-group-rider")
    public void listenRiderLocation(RiderLocation riderLocation) {
        System.out.println("Current Rider Location: " + riderLocation.getRiderId()+" : "+riderLocation.getLatitude()
                +" : "+riderLocation.getLongitude());
    }

}
