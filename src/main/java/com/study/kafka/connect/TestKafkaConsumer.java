package com.study.kafka.connect;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class TestKafkaConsumer {
    @KafkaListener(topics="test")
    public void consume(String message){
        log.info("Received message : {}", message);
    }
}
