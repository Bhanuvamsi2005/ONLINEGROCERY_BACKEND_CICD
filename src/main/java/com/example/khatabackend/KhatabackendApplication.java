package com.example.khatabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.boot.context.properties.EnableConfigurationProperties;
// import com.example.khatabackend.auth.TwilioConfig;
import com.twilio.Twilio;
import jakarta.annotation.PostConstruct;

@SpringBootApplication
// @EnableConfigurationProperties(TwilioConfig.class) // Tell Spring to bind this config
public class KhatabackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(KhatabackendApplication.class, args);
    }
}
