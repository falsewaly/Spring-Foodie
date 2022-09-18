package com.foodie.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.foodie.spring.model.Dish;
import com.foodie.spring.repository.DishRepository;

import lombok.AllArgsConstructor;

@Service
public class DishService {
	
	@Autowired
	private DishRepository dishRepository;
	
	public Dish saveDish(Dish dish) {
        return dishRepository.save(dish);
    }
	
    public Dish getDish(String id) {
    	return dishRepository.findById(id).orElse(null);
    }
	
	public List<Dish> getAllDishes() {
		return dishRepository.findAll();
	}
	
    public List<Dish> deleteProgram(String id) {
    	dishRepository.deleteById(id);
        return dishRepository.findAll();
    }

    public Dish updateDish(String id, Dish dish) {
		Dish existingDish = dishRepository.findById(id).orElse(null);
		existingDish.setName(dish.getName());
		existingDish.setDescription(dish.getDescription());
		existingDish.setCategory(dish.getCategory());
		existingDish.setPrice(dish.getPrice());
		return dishRepository.save(existingDish);
    }
}
