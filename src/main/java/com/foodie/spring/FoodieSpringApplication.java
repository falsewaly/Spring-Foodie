package com.foodie.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodie.spring.model.Dish;
import com.foodie.spring.repository.DishRepository;

@SpringBootApplication
@RestController
public class FoodieSpringApplication {
	
	@GetMapping("/")
	public String greet( ) {
		return "Hello Someguy";
	}

	public static void main(String[] args) {
		SpringApplication.run(FoodieSpringApplication.class, args);
	}

}
