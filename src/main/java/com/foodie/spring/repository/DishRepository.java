package com.foodie.spring.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.foodie.spring.model.Dish;

public interface DishRepository extends MongoRepository<Dish, String>{

}
