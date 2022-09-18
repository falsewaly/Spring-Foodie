package com.foodie.spring.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "dishes")
public class Dish {
	@Id
	private String id;
	private String name;
	private String description;
	private String category;
	private int price;
	
}
