package com.producer.producer_demo_app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.producer.producer_demo_app.data.DataStreamConsumer;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/datastream")
public class DataStreamController {
    private final DataStreamConsumer dataStreamConsumer;

    @GetMapping
    public void startPublishing() {
        dataStreamConsumer.consumeDataStreamAndPublish();
    }
}
