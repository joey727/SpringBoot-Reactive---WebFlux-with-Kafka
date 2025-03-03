package com.producer.producer_demo_app.data;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.producer.producer_demo_app.producer.WebProducer;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DataStreamConsumer {
    private final WebClient webClient;
    private final WebProducer webProducer;

    public DataStreamConsumer(WebClient.Builder webClientBuilder, WebProducer webProducer) {
        this.webClient = webClientBuilder.baseUrl("https://stream.wikimedia.org/v2").build();
        this.webProducer = webProducer;
    }

    public void consumeDataStreamAndPublish() {
        webClient.get().uri("/stream/recentchange").retrieve().bodyToFlux(String.class)
        .subscribe(webProducer :: sendStream);
    }
    
}

