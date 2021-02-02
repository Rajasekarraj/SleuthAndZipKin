package com.example.orderservice.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
public class OrderController {

  public Logger logger = LoggerFactory.getLogger(OrderController.class);

  private final WebClient webClient;

  OrderController(WebClient.Builder webClientBuilder) {
    this.webClient = webClientBuilder.build();
  }


  @GetMapping("/order")
  public Mono<String> order() {
    logger.info("Hello from order service");
    return webClient.get()
        .uri("http://localhost:8082/payment")
        .retrieve()
        .bodyToMono(String.class);
  }
}
