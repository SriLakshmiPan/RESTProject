package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration//EnableautoconfigarationAnnotation is to enable the application automatically
public class LDemoapplication {
	public static void main(String[] args) {
		SpringApplication.run(LDemoapplication.class, args);
		//EnableautoconfigarationAnnotation calls the springappliacation
 System.out.println("This is my first program");
	}

}
