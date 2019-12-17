package com.sn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ShoppingMqServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoppingMqServiceApplication.class, args);
	}

}
