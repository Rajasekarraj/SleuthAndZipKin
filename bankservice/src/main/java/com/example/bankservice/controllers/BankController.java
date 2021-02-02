package com.example.bankservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class BankController {

  public Logger logger = LoggerFactory.getLogger(BankController.class);


  @GetMapping("/bank")
  public Mono<String> bank() {
    logger.info("Hello from bank service");
    return Mono.just("Payment successful");
  }
}
