package io.quarkus.todospringquarkus;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.MeterRegistryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.MeterRegistry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Configuration
public class TodoConfiguration {

    Logger logger=LoggerFactory.getLogger(this.getClass());

    @Value("${server.port}")
    String port;

    @Value("${server.address}")
    String address;
    
    @Value("${spring.boot.admin.client.instance.service-base-url}")
    String service_base_url;
    
    @Value("${spring.boot.admin.client.url}")
    String url;
    
    @Bean
    public boolean config(){
        logger.warn("Server port is set to: " + port);
        logger.warn("Server address is set to: " + address);
        logger.warn("spring.boot.admin.client.instance.service-base-url is set to: " + service_base_url);
        logger.warn("spring.boot.admin.client.url is set to: " + url);
        return true;
    }


    // @Bean
    // MeterRegistryCustomizer<MeterRegistry> metricsCommonTags() {
    //     return registry -> registry.config().commonTags("application", "Spring");
    //}

    }
