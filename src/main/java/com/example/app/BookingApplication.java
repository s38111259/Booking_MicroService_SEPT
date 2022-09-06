package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories("com.delivery.repository")

@ComponentScan(basePackages = {"com.example.app"})

//@EnableJpaRepositories(basePackages = "com.example.app.respository")
@SpringBootApplication
public class BookingApplication {

	public static void main(String[] args) {

		SpringApplication.run(BookingApplication.class, args);
	}

}
