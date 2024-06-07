package com.study.kafka.connect;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@SpringBootTest
class TestKafkaProducerTest {
    @Autowired private TestKafkaProducer testKafkaProducer;

    @Test
    public void sendMessage(){
        testKafkaProducer.sendMessage("test", "delete all");
    }
}