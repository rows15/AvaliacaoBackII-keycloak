package com.dh.petshopservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PetShopServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetShopServiceApplication.class, args);
	}

}
