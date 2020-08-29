package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
@RestController
class LExample {
	public static void main(String[] args) {
		SpringApplication.run(LExample.class, args);
		
	}

	@RequestMapping("/hi")
	@ResponseBody
	//@GetMapping("/hi")
	public String hello(@RequestParam(value = "name", defaultValue = "this is my first program") String name) {
		return String.format("Hello!! %s!", name);

	}

}