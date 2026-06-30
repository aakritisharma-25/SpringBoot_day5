package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IciciBankServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(IciciBankServiceApplication.class, args);
		System.out.println("Service started");
	}

}
