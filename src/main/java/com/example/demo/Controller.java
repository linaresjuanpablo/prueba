package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;



@RestController
public class Controller {
	
	private final RestTemplate restTemplate;
	@Autowired
	public Controller (RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}
	
	
	
	@GetMapping("/test")
	public Object getApi() {
		//String url = "https:api.themoviedb.org/3/movie/popular?api_key=7be72508776961f3948639fbd796bccd";
		String url = "https://jsonplaceholder.typicode.com/todos";
		return restTemplate.getForObject(url, Object.class);
		
	}
	
	
   //https://jsonplaceholder.typicode.com/todos
}
