package com.thecoderstv.embarx_producer.controller;

import com.thecoderstv.embarx_producer.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.function.Supplier;

@Configuration
public class KafkaProducerStreams {
    @Bean
    public Supplier<RiderLocation> sendRiderLocation() {
        return () -> {
            RiderLocation riderLocation = new RiderLocation("Rider111", 1212.2334, 123.2323);
            System.out.println("Sending Rider Location : " + riderLocation.getRiderId());
            return riderLocation;
        };
    }
}
