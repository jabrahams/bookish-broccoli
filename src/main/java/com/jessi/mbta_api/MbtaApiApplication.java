package com.jessi.mbta_api;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.github.jasminb.jsonapi.JSONAPIDocument;
import com.github.jasminb.jsonapi.ResourceConverter;

@SpringBootApplication
public class MbtaApiApplication {

	public static void main(String[] args) {
		connectToMbta();
	}
	
	static void connectToMbta() {
	    RestTemplate restTemplate = new RestTemplate();
	    
        ResourceConverter converter = new ResourceConverter(Route.class);

        String jsonApi = restTemplate.getForObject("https://api-v3.mbta.com/routes", String.class);
        
        JSONAPIDocument<List<Route>> jsonApiRoutes = converter.readDocumentCollection(jsonApi.getBytes(), Route.class);
        List<Route> routes = jsonApiRoutes.get();
        
        for (Route route : routes) {
            System.out.println("Name: " + route.longName);
            System.out.println("Short name: " + route.shortName);
            System.out.println("Color: " + route.color);
            System.out.println("Description: " + route.description);
            System.out.println("Directions:");
            for (String direction : route.directionNames) {
                System.out.println(direction);
            }
        }    
        
	}
}
