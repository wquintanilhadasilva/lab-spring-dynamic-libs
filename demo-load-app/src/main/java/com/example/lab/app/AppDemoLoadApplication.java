package com.example.lab.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.lab.adapters", "com.example.lab"})
public class AppDemoLoadApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppDemoLoadApplication.class, args);
	}

}
