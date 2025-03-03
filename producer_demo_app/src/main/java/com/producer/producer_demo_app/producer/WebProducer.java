package com.producer.producer_demo_app.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class WebProducer {
    private final KafkaTemplate<String, String> kafkaTemplate;

    public void sendStream(String stream) {
        // log.info(String.format("sending data to DataStream :: %s", stream));
        kafkaTemplate.send("DataStream", stream);
    }

}
