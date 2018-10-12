package com.jessi.mbta_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MbtaApiApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MbtaApiApplication.class, args);
		System.out.println("hi");
		
		RestTemplate restTemplate = new RestTemplate();
		List<Route> routes = restTemplate.get
		
	}
}
