package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/message")
	public String fetchMessage() {

		String response = restTemplate.getForObject("https://localhost:8443/hello", String.class);

		return response;
	}
}
