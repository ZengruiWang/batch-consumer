package com.example.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;
import java.util.function.Supplier;

@SpringBootApplication
public class ProducerApplication {
  private static final Logger LOGGER = LoggerFactory.getLogger(ProducerApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(ProducerApplication.class, args);
  }

  @Bean
  public Supplier<SimpleEntity> publishSimpleEntity() {
    return () -> {
      SimpleEntity simpleEntity = new SimpleEntity(new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()), UUID.randomUUID(), "poller");
      LOGGER.info("published SimpleEntity: " + simpleEntity);
      return simpleEntity;
    };
  }
}
