package com.simplon.ministry.financeandeconomy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class FinanceAndEconomyApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinanceAndEconomyApplication.class, args);
	}

}
