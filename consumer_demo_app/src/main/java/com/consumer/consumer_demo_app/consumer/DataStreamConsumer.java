package com.consumer.consumer_demo_app.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DataStreamConsumer {
    
    @KafkaListener(topics = "DataStream", groupId = "myGroup")
    public void consumeData(String data) {
        log.info(String.format("consuming from DataStream... %s", data));
    }
}
