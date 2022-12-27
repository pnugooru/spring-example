package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
public class Application {
	
	@GetMapping("/")
	public String welcome() {
		return "Hi Welcome to Pradeep Cloud";
	}
	
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hi" +input+ "Your application is successfully deployed ...";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
