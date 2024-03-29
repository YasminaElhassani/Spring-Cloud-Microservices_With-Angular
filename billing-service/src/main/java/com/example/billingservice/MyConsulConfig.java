package com.example.billingservice;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@Data
@ConfigurationProperties(prefix = "token")
public class MyConsulConfig {
    private Long accessTokenTimeout;
    private Long refreshTokenTimeout;

}
