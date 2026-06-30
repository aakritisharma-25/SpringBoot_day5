package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@GetMapping("/product")
	public String getProduct() throws InterruptedException {
		Thread.sleep(5000);
		return "Laptop price = Rupes- 65000";
	}
}
