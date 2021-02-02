package com.example.paymentservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class PaymentController {

  public Logger logger = LoggerFactory.getLogger(PaymentController.class);

  private final WebClient webClient;

  PaymentController(WebClient.Builder webClientBuilder) {
    this.webClient = webClientBuilder.build();
  }


  @GetMapping("/payment")
  public Mono<String> payment() {
    logger.info("Hello from payment service");
    return webClient.get()
        .uri("http://localhost:8083/bank")
        .retrieve()
        .bodyToMono(String.class);
  }
}
