//package com.example.orderservice.configuration;
//
//import brave.Tracing;
//import org.springframework.beans.factory.BeanFactory;
//import org.springframework.boot.autoconfigure.AutoConfigureAfter;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
//import org.springframework.cloud.sleuth.instrument.web.TraceWebFilter;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * {@link org.springframework.boot.autoconfigure.EnableAutoConfiguration
// * Auto-configuration} enables tracing to HTTP requests with Spring WebFlux.
// *
// * @author Marcin Grzejszczak
// * @since 2.0.0
// */
//@Configuration
//@ConditionalOnProperty(value = "spring.sleuth.web.enabled", matchIfMissing = true)
//@ConditionalOnWebApplication(type = ConditionalOnWebApplication.Type.REACTIVE)
//@ConditionalOnBean(Tracing.class)
//@AutoConfigureAfter(ZipkinConfiguration.class)
//public class ZipkinConfiguration {
//
//  @Bean
//  public TraceWebFilter traceFilter(BeanFactory beanFactory) {
//    return new TraceWebFilter(beanFactory);
//  }
//
//}