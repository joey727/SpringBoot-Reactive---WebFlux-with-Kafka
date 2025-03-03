package com.consumer.consumer_demo_app.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class AppTopicConfig {
    @Bean
    public NewTopic appTopic() {
        return TopicBuilder.name("DataStream").build();
    }
}
