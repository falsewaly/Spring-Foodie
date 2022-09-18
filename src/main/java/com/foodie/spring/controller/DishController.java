package com.foodie.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodie.spring.model.Dish;
import com.foodie.spring.service.DishService;

import lombok.AllArgsConstructor;

@RestController
public class DishController {
	
	@Autowired
	private DishService dishService;
	
	@PostMapping("/api/dishes")
    public Dish saveDish(@RequestBody Dish dish) {
        return dishService.saveDish(dish);
    }
	
	@PutMapping("/api/dishes/{id}")
    public Dish updateDish(@PathVariable String id, @RequestBody Dish dish) {
        return dishService.updateDish(id, dish);
    }
	
	@GetMapping("/api/dishes/{id}")
	public Dish getDish(@PathVariable String id) {
		return dishService.getDish(id);
	}
	
	@GetMapping("/api/dishes")
	public List<Dish> getAllDishes() {
		return dishService.getAllDishes();
	}
	
	@DeleteMapping("/api/dishes/{id}")
	public List<Dish> deleteProgram(@PathVariable String id) {
        return dishService.deleteProgram(id);
    }

}
