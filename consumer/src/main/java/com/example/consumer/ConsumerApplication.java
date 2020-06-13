package com.example.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;

import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication
public class ConsumerApplication {
  private static final Logger LOGGER = LoggerFactory.getLogger(ConsumerApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(ConsumerApplication.class, args);
  }

  @Bean
  public Consumer<Message<List<SimpleEntity>>> logMessages() {
    return messages -> {
      LOGGER.info("Batch Message: " + messages);
    };
  }
}
