package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.microsoft.applicationinsights.attach.ApplicationInsights;

@RestController
@SpringBootApplication
public class DemoApplication {

	@GetMapping("/hello")
	public String hello(){
		return "hello";
	}

	public static void main(String[] args) {
		ApplicationInsights.attach();
		SpringApplication.run(DemoApplication.class, args);
	}

}
