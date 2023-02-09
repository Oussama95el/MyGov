package com.simplon.ministry.justice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class JusticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(JusticeApplication.class, args);
    }

}
