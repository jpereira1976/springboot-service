package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@PostMapping("/hi")
	public String hello(@RequestBody String name) {
		return "Hola " + name;
	}
	
	@GetMapping("/bye")
	public String bye(@RequestParam("name") String name) {
		return "Bye bye " + name;
	}
	
	@PostMapping("/hi-client")
	public String hello(@RequestBody Client client) {
		return "Hola cliente " + client.getName() + ", Id: " + client.getId();
	}

	@PostMapping("/hi-client-echo")
	public Client helloEcho(@RequestBody Client client) {
		return client;
	}
	
}
