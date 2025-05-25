package com.thecoderstv.embarx_consumer.component;

import com.thecoderstv.embarx_consumer.RiderLocation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class KafkaConsumerStreams {
    @Bean
    public Consumer<RiderLocation> processRiderLocation() {
        return location -> {
            System.out.println("Received:" + location.getRiderId() + "@"+location.getLatitude()+", "+location.getLongitude());
        };
    }
}
